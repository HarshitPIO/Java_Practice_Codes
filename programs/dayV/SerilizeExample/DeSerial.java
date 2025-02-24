package abhyas.dayV.SerilizeExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerial {
    public static void main(String[] args) throws FileNotFoundException {


        try (FileInputStream fis = new FileInputStream("ob.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Student student = (Student) ois.readObject();
            student.displayName();
//            ois.close();
//            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
