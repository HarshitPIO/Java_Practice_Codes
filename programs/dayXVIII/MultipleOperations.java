package abhyas.dayXVIII;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MultipleOperations {
    private static final String url = "jdbc:mysql://localhost:3306/freshers";
    private static final String username = "root";
    private static final String password = "123.com";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO DEPARTMENT(DEPARTMENTID, DEPARTMENTNAME) VALUES(?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            Scanner scanner = new Scanner(System.in);
            String choice = "Y";
            while (choice.toUpperCase().equals("Y")) {
                System.out.println("Enter department id");
                int id = scanner.nextInt();
                System.out.println("Enter department name");
                String name = scanner.next();
                System.out.println("Do you wan to add more? {Y/N}");
                choice = scanner.next();
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, name);
                preparedStatement.addBatch();
            }

            int[] arr = preparedStatement.executeBatch();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    System.out.println("Query " + i + " not executed");
                } else System.out.println("Execution Completed");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
