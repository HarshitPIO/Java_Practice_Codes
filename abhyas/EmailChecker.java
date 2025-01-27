package abhyas;

import java.util.Scanner;
import java.util.regex.*;
public class EmailChecker{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Email");
        String email = sc.nextLine();
        Pattern pattern  = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}");
        Matcher matcher = pattern.matcher(email);
        if(matcher.find()) {
            System.out.println("Valid Email");
        }
        else {
            System.out.println("Invalid Email");
        }
    }
}
