package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConection();
             Statement statement = conn.createStatement()) {
            statement.executeUpdate(sql);
            int rowsAffected = statement.executeUpdate(sql);
            log.info("Inserted producer '{}' in the database, rows affected '{}'", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
            throw new RuntimeException(e);
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        try (Connection conn = ConnectionFactory.getConection();
             Statement statement = conn.createStatement()) {
            statement.executeUpdate(sql);
            int rowsAffected = statement.executeUpdate(sql);
            log.info("Deleted producer '{}' from the database, rows affected '{}'", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
            throw new RuntimeException(e);
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s ' WHERE (`id` = '%d');"
                .formatted(producer.getName(), producer.getId());
        try (Connection conn = ConnectionFactory.getConection();
             Statement statement = conn.createStatement()) {
            statement.executeUpdate(sql);
            int rowsAffected = statement.executeUpdate(sql);
            log.info("Updated producer '{}',  rows affected '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
            throw new RuntimeException(e);
        }
    }
    public static void updatePreparedStatement(Producer producer) {
        try (Connection conn = ConnectionFactory.getConection();
             PreparedStatement ps = preparedStatementUpdate(conn, producer)) {
            int rowsAffected = ps.executeUpdate();
            log.info("Updated producer '{}',  rows affected '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }
    private static PreparedStatement preparedStatementUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2,  producer.getId());
        return ps;
    }

    public static List<Producer> findAll() {
        log.info("Finding all Producers");
        String sql = "SELECT id, name FROM anime_store.producer;";
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConection();
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {
            while (rs.next()) {
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
            throw new RuntimeException(e);
        }
        return producers;
    }

    public static List<Producer> findByName(String name) {
        log.info("Finding Producers by name");
        String sql = "select * from anime_store.producer where name like '%%%s%%'"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConection();
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {
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
            throw new RuntimeException(e);
        }
        return producers;
    }

    public static List<Producer> findByNamePreparedStatement(String name) {
        log.info("Finding Producers by name");
        String sql = "select * from anime_store.producer where name like ?;"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConection();
             PreparedStatement ps = preparedStatementFindByName(conn, name)) {
            ResultSet rs = ps.executeQuery();
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
    private static PreparedStatement preparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "select * from anime_store.producer where name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }
    public static List<Producer> findByNameCallableStatement(String name) {
        log.info("Finding Producers by name");
        String sql = "select * from anime_store.producer where name like ?;"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConection();
             PreparedStatement ps = callableStatementFindByName(conn, name)) {
            ResultSet rs = ps.executeQuery();
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

    private static PreparedStatement callableStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "CALL `anime_store`.`sp_get_producer_by_name`(?);";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString(1, String.format("%%%s%%", name));
        return cs;
    }

    public static void showProducerMetaData() {
        log.info("Showing Producer MetaData");
        String sql = "select * from anime_store.producer;";
        try (Connection conn = ConnectionFactory.getConection();
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int columnCount = rs.getMetaData().getColumnCount();
            log.info("Columns count  '{}'", columnCount);
            for (int i = 1; i < columnCount; i++) {
                log.info("Table name  '{}'", rs.getMetaData().getTableName(i));
                log.info("Column name  '{}'", rs.getMetaData().getColumnName(i));
                log.info("Column size  '{}'", rs.getMetaData().getColumnDisplaySize(i));
                log.info("Column type  '{}'", rs.getMetaData().getColumnTypeName(i));
            }
        } catch (SQLException e) {
            log.error("Error while trying to find producers by name ", e);
            throw new RuntimeException(e);
        }
    }

    public static void showDriverMetaData() {
        log.info("Showing Driver MetaData");
        String sql = "select * from anime_store.producer;";
        try (Connection conn = ConnectionFactory.getConection()) {
            DatabaseMetaData dbMetaData = conn.getMetaData();
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Supports TYPE_FORWARD_ONLY ");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Supports TYPE_SCROLL_INSENSITIVE ");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Supports TYPE_SCROLL_INSENSITIVE ");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }

        } catch (SQLException e) {
            log.error("Error while trying to find producers by name ", e);
            throw new RuntimeException(e);
        }
    }

    public static void showTypeScrollWorking() {
        log.info("Finding Producers by name");
        String sql = "select * from anime_store.producer;";

        try (Connection conn = ConnectionFactory.getConection();
             Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = statement.executeQuery(sql)) {
            log.info("Last row '{}' ", rs.last());
            log.info("Row number '{}' ", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("First row '{}' ", rs.first());
            log.info("Row number '{}' ", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Row Absolute ? '{}' ", rs.absolute(2));
            log.info("Row number '{}' ", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Row Absolute ? '{}' ", rs.relative(-1));
            log.info("Row number '{}' ", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("is last ? '{}'", rs.isLast());
            log.info("Row number '{}' ", rs.getRow());

            log.info("is first ? '{}'", rs.first());
            log.info("Row number '{}' ", rs.getRow());

            log.info("Last row '{}' ", rs.last());
            log.info("---------------------");
            rs.next();
            log.info("After last row ? '{}' ", rs.isAfterLast());
            while (rs.previous()) {
                log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            }

        } catch (SQLException e) {
            log.error("Error while trying to find producers by name ", e);
            throw new RuntimeException(e);
        }
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        log.info("Finding Producers by name");
        String sql = "select * from anime_store.producer where name like '%%%s%%'"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConection();
             Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = statement.executeQuery(sql)) {
            while (rs.next()) {
                rs.updateString("name", rs.getString("name").toUpperCase());
                rs.updateRow();
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find producers by name ", e);
            throw new RuntimeException(e);
        }
        return producers;
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        log.info("Finding Producers by name");
        String sql = "select * from anime_store.producer where name like '%%%s%%'"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConection();
             Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = statement.executeQuery(sql)) {
            if (rs.next()) return producers;

            insertNewProducer(name, rs);

            producers.add(getProducer(rs));
        } catch (SQLException e) {
            log.error("Error while trying to find producers by name ", e);
            throw new RuntimeException(e);
        }
        return producers;
    }

    public static void findByNameAndDelete(String name) {
        log.info("Finding Producers by name");
        String sql = "select * from anime_store.producer where name like '%%%s%%'"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConection();
             Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = statement.executeQuery(sql)) {
            while (rs.next()) {
                log.info("Deleting '{}'", rs.getString("name"));
                rs.deleteRow();
            }
        } catch (SQLException e) {
            log.error("Error while trying to find producers by name ", e);
        }
    }

    private static void insertNewProducer(String name, ResultSet rs) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("name", name);
        rs.insertRow();
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();
        return Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
    }
}
