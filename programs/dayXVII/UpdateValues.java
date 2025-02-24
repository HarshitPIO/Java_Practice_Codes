package abhyas.dayXVII;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateValues {
    private static final String url = "jdbc:mysql://localhost:3306/freshers";
    private static final String username = "root";
    private static final String password = "123.com";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query = String.format("UPDATE DEPARTMENT SET DEPARTMENTID = %d WHERE DEPARTMENTNAME ='%s'",104,"Java");
            int rowsAffected = statement.executeUpdate(query);
            if(rowsAffected>0) {
                System.out.println("Updated successfully");
            } else System.out.println("Updation failed");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
