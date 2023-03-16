package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConection();
             Statement statement = conn.createStatement()) {
            statement.executeUpdate(sql);
            int rowsAffected = statement.executeUpdate(sql);
            log.info("Inserted producer '{}' in the database, rows affected '{}'",producer.getName(), rowsAffected);
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
            log.info("Deleted producer '{}' from the database, rows affected '{}'",id, rowsAffected);
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
}
