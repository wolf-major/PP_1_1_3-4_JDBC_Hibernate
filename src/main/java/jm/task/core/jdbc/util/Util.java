package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static String dbURL = "jdbc:mysql://localhost:3306/preproject_1_1_3";
    private static String dbUser = "root";
    private static String dbPass = "root";

    public String getDbURL() {
        return dbURL;
    }

    public String getDbUser() {
        return dbUser;
    }

    public String getDbPass() {
        return dbPass;
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
