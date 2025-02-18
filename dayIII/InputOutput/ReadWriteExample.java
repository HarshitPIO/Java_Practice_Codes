package abhyas.dayIII.InputOutput;
import java.io.*;

public class ReadWriteExample {
    public static void main(String[] args) throws IOException {
        String[] names = {"John", "Carl", "Jerry"};
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("File.csv"));
            writer.write("Writing to a file.");
            for (String name : names) {
                writer.write( name);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
