package academy.devdojo.maratonajava.javacore.ZZJcrud.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class ProducerRepository {
    public static List<academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer> findByName(String name) {
        log.info("Finding Producers by name '{}'", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConection();
             PreparedStatement ps = createPrepareStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find producers by name ", e);
        }
        return producers;
    }

    private static PreparedStatement createPrepareStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "select * from anime_store.producer where name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static Optional<Producer> findById(Integer id) {
        log.info("Finding Producers by id '{}'", id);
        try (Connection conn = ConnectionFactory.getConection();
             PreparedStatement ps = createPrepareStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();
            return Optional.of(Producer
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());
        } catch (SQLException e) {
            log.error("Error while trying to find producers by id ", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPrepareStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = "select * from anime_store.producer where id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = ?);";
        try (Connection conn = ConnectionFactory.getConection();
             PreparedStatement ps = createPrepareStatementdelete(conn, id)) {
            ps.execute();
            log.info("Deleted producer '{}' from the database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createPrepareStatementdelete(Connection conn, Integer id) throws SQLException {
        String sql = "select * from anime_store.producer where (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", id));
        return ps;
    }

    public static void save(Producer producer) {
        log.info("Saving Producer '{}'", producer);
        try (Connection conn = ConnectionFactory.getConection();
             PreparedStatement ps = createPrepareStatementSave(conn, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
            throw new RuntimeException(e);
        }
    }

    public static PreparedStatement createPrepareStatementSave(Connection conn, Producer producer) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }

    public static void update(Producer producer) {
        try (Connection conn = ConnectionFactory.getConection();
             PreparedStatement ps = createPreparedStatementUpdate(conn, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s ' WHERE (`id` = '%d');";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }
}
