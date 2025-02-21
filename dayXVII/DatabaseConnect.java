package abhyas.dayXVII;

import java.sql.*;

public class DatabaseConnect {
    private static final String url = "jdbc:mysql://localhost:3306/freshers";
    private static final String username = "root";
    private static final String password ="123.com";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM DEPARTMENT";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()) {
                int id = resultSet.getInt("DEPARTMENTID");
                String name = resultSet.getString("DEPARTMENTNAME");
                System.out.println("{Id: "+ id + " Name: " +name+"},");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
