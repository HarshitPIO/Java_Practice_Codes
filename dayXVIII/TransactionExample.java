package abhyas.dayXVIII;

import java.sql.*;
import java.util.Scanner;

public class TransactionExample {
    private static final String url = "jdbc:mysql://localhost:3306/freshers";
    private static final String username = "root";
    private static final String password = "123.com";

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String choice ="Y";
            Connection connection = DriverManager.getConnection(url, username, password);
            CallableStatement callableStatement =null;
            connection.setAutoCommit(false);
            while(choice.toUpperCase().equals("Y")) {
                System.out.println("Enter choice");
                System.out.println("1. add customer");
                System.out.println("2. withdraw balance");
                System.out.println("3. add balance");
                int choice1 = scanner.nextInt();
                switch (choice1) {
                    case 1: {
                         callableStatement = connection.prepareCall("{CALL new_customer(?,?)}");
                        System.out.println("enter name");
                        String name = scanner.next();
                        System.out.println("enter amount");
                        int amount = scanner.nextInt();
                        callableStatement.setInt(1,amount);
                        callableStatement.setString(2,name);
                        callableStatement.execute();
                        int result = callableStatement.getUpdateCount();
                        if(result>0) {
                            connection.commit();
                            System.out.println("execution completed");
                        } else {
                            connection.rollback();
                            System.out.println("failed");
                        }
                        break;
                    }
                    case 2: {
                        callableStatement = connection.prepareCall("{CALL withdraw(?,?,?)}");
                        System.out.println("Enter name of debitor");
                        String debitor = scanner.next();
                        System.out.println("Enter name of creditor");
                        String creditor = scanner.next();
                        System.out.println("Enter amount");
                        int amount = scanner.nextInt();
                        callableStatement.setString(1,debitor);
                        callableStatement.setString(2,creditor);
                        callableStatement.setInt(3,amount);
                        callableStatement.execute();
                        int result = callableStatement.getUpdateCount();
                        if(result>0) {
                            connection.commit();
                            System.out.println("execution completed");
                        } else {
                            connection.rollback();
                            System.out.println("failed");
                        }
                        break;
                    }
                    case 3: {
                        callableStatement = connection.prepareCall("{CALL add(?,?)}");
                        System.out.println("enter name");
                        String creditor = scanner.next();
                        System.out.println("enter amount");
                        int balance = scanner.nextInt();
                        callableStatement.setString(1,creditor);
                        callableStatement.setInt(2,balance);
                        callableStatement.execute();
                        int result = callableStatement.getUpdateCount();
                        if(result>0) {
                            connection.commit();
                            System.out.println("execution completed");
                        } else {
                            connection.rollback();
                            System.out.println("failed");
                        }
                        break;
                    }
                    default:
                        System.out.println("invalid choice");
                }
                System.out.println("Want to perform another operation?(Y/N");
                choice = scanner.next();
            }

            if( callableStatement != null) {
                callableStatement.close();
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
