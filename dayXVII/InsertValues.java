package abhyas.dayXVII;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class InsertValues {
    private static final String url = "jdbc:mysql://localhost:3306/freshers";
    private static final String username = "root";
    private static  final String password = "123.com";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query = String.format("INSERT INTO DEPARTMENT(DEPARTMENTID,DEPARTMENTNAME) VALUES(%d,'%s')",103,"Java");
            int rowsAffected = statement.executeUpdate(query);
            if(rowsAffected>0) {
                System.out.println("Inserted Successfully");
            }
            else {
                System.out.println("Insertion failed");
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
