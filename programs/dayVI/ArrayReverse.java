package abhyas.dayVI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayReverse {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> linkList = new LinkedList<>();
        arr.add(10);
        arr.add(0,11);
        arr.add(13);
        arr.add(14);
        System.out.println("Array: " + arr);
        Collections.reverse(arr);
        linkList.addAll(arr);
        System.out.println("linkedList: " + linkList);
    }
}
