package goit.education.connect_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final Database INSTANCE = new Database();
    private static final String CONNECTION_URL = "jdbc:h2:.\\init_db";
    Connection conn;

    private Database() {
        try {
            conn = DriverManager.getConnection(CONNECTION_URL);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Database getInstance() {
        return INSTANCE;
    }

    public Connection getConnection() {
        return conn;
    }

    public void closeConn() {
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
