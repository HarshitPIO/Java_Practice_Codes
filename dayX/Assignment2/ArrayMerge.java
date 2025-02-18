package abhyas.dayX.Assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayMerge {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list2.add(2);
        list2.add(6);
        list2.add(5);
        list2.add(7);
        Set<Integer> set = new HashSet<>(list1);
        set.addAll(list2);
        List<Integer> list3 = new ArrayList<>(set);
        System.out.println("set: " + set);
    }

}
