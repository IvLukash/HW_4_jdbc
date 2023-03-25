package goit.education.all_queries;

import goit.education.connect_db.Database;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {

    private final Connection connection = Database.getInstance().getConnection();

    public List<MaxSalaryWorker> findMaxSalaryWorker() {
        List<MaxSalaryWorker> result = new ArrayList<>();
        try (Statement stat = connection.createStatement()) {
            String query = Files.readString(Paths.get(".\\sql\\find_max_salary_worker.sql"));
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                MaxSalaryWorker worker = new MaxSalaryWorker();
                worker.setName(rs.getString("name"));
                worker.setSalary(rs.getInt("salary"));
                result.add(worker);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<LongestProject> findLongestProject() {
        List<LongestProject> result = new ArrayList<>();
        try (Statement stat = connection.createStatement()) {
            String query = Files.readString(Paths.get(".\\sql\\find_longest_project.sql"));
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                LongestProject project = new LongestProject();
                project.setName(rs.getString("name"));
                project.setMonthCount(rs.getInt("month_count"));
                result.add(project);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<MaxProjectCountClient> findMaxProjectCountClient() {
        List<MaxProjectCountClient> result = new ArrayList<>();
        try (Statement stat = connection.createStatement()) {
            String query = Files.readString(Paths.get(".\\sql\\find_max_projects_client.sql"));
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                MaxProjectCountClient client = new MaxProjectCountClient();
                client.setName(rs.getString("name"));
                client.setProjectCount(rs.getInt("project_count"));
                result.add(client);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<ProjectPrice> printProjectPrice() {
        List<ProjectPrice> result = new ArrayList<>();
        try (Statement stat = connection.createStatement()) {
            String query = Files.readString(Paths.get(".\\sql\\print_project_prices.sql"));
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                ProjectPrice price = new ProjectPrice();
                price.setName(rs.getString("name"));
                price.setPrice(rs.getInt("price"));
                result.add(price);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<YoungestEldestWorker> findYoungestEldestWorker() {
        List<YoungestEldestWorker> result = new ArrayList<>();
        try (Statement stat = connection.createStatement()) {
            String query = Files.readString(Paths.get(".\\sql\\find_youngest_eldest_workers.sql"));
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                YoungestEldestWorker worker = new YoungestEldestWorker();
                worker.setType(rs.getString("type"));
                worker.setName(rs.getString("name"));
                worker.setBirthday(LocalDate.parse(rs.getString("birthday")));
                result.add(worker);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
