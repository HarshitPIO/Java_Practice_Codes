package abhyas;

import java.util.regex.*;
import java.util.Scanner;
public class CardDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cardNumber = sc.nextLine();
        Pattern pattern  = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
        Matcher matcher = pattern.matcher(cardNumber);
        String maskedCardNumber = matcher.replaceAll("XXXX-XXXX-XXXX-");
        System.out.println(maskedCardNumber);
    }
}