package goit.education.populate_db;

import goit.education.connect_db.Database;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Statement;

public class DatabasePopulateService {
    public static void main(String[] args) {
        Connection connection = Database.getInstance().getConnection();
        try (Statement stat = connection.createStatement()) {
            String sqlCommand = Files.readString(Paths.get(".\\sql\\populate_db.sql"));
            stat.executeUpdate(sqlCommand);
            Database.getInstance().closeConn();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
