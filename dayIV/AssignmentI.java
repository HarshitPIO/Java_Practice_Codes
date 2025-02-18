package abhyas.dayIV;

import java.io.*;

public class AssignmentI {
    public static void main(String[] args) {
        String longestWord = "";

        try (BufferedReader reader = new BufferedReader(new FileReader("File.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(",");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("The longest word is: " + longestWord);
    }
}

