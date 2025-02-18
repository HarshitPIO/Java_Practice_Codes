package abhyas.dayIX;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("e");
        list.add("d");
        list.add("b");
        list.add("c");
        Collections.sort(list);
        for(String str: list) {
            System.out.println(" " + str);
        }
    }
}
