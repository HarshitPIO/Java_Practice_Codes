package abhyas.dayV.SerilizeExample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) {
        Student student = new Student("harshit", 21,2,"jaipur","abc@gmail.com");
        try(FileOutputStream fos = new FileOutputStream("ob.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
