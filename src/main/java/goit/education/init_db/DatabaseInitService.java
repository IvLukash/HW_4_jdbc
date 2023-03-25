package goit.education.init_db;

import goit.education.connect_db.Database;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Statement;

public class DatabaseInitService {
    public static void main(String[] args) {
        Connection connection = Database.getInstance().getConnection();
        try (Statement stat = connection.createStatement()) {
            String text = Files.readString(Paths.get(".\\sql\\init_db.sql"));
            String[] sqlCommands = text.split(";");
            for (String sqlCommand : sqlCommands) {
                stat.executeUpdate(sqlCommand);
            }
            Database.getInstance().closeConn();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
