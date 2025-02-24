package abhyas.dayXVII;

import java.sql.*;

public class DeleteValue {
    private static final String url = "jdbc:mysql://localhost:3306/freshers";
    private static final String username = "root";
    private static final String password = "123.com";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query = "DELETE  FROM DEPARTMENT WHERE DEPARTMENTID = 104 ";
            int rowsAffected = statement.executeUpdate(query);
            if(rowsAffected>0) System.out.println("Deleted successfully ");
            else System.out.println("Deletion failed");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
