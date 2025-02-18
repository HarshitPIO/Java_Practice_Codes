package abhyas.dayVII;
import java.util.*;
public class MapExample {
    public static void hashMApDemo() {
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("john", 21);
        map1.put("vick", 23);
        map1.put("steve", null);
        System.out.println(map1);
        map1.put("steve", 26);
        System.out.println(map1);
        System.out.println("Contains John? " + map1.containsKey("john"));
        System.out.println("john's age: " + map1.get("john"));
    }

    public static void main(String[] args) {
        hashMApDemo();
    }
}
