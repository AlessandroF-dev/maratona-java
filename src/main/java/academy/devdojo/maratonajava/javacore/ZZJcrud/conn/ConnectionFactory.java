package academy.devdojo.maratonajava.javacore.ZZJa.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String username = "root";
        String password = "root";
        return DriverManager.getConnection(url, username, password);
    }
}

