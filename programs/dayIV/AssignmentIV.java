package abhyas.dayIV;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AssignmentIV {
    public static void main(String[] args) throws IOException {
        String text = ",Humans";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("File.csv", true))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
