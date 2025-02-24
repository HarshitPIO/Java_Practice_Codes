package abhyas.dayIV;

import java.io.*;

public class AssignmentIII {
    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("File.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        builder.reverse();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write(builder.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
            e.printStackTrace();
        }
    }
}