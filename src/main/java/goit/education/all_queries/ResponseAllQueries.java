package goit.education.all_queries;

import goit.education.connect_db.Database;

import java.util.List;

public class ResponseAllQueries {
    public static void main(String[] args) {
        List<MaxProjectCountClient> maxProjectCountClients = new DatabaseQueryService().findMaxProjectCountClient();
        System.out.println(maxProjectCountClients);
        Database.getInstance().closeConn();
    }
}
