package abhyas.dayVIII;

import java.util.Scanner;
import java.util.TreeSet;

public class UniqueCharFinder {
    public static void main(String[] args) {
        TreeSet<Character> uniqueChar = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String input = scanner.nextLine();
        for(char ch: input.toCharArray()) {
            uniqueChar.add(ch);
        }
        System.out.println("Unique Characters in the string are: ");
        for(char ch: uniqueChar) {
            System.out.println(ch + " ");
        }
    }
}
