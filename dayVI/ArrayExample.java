package abhyas.dayVI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayExample {
    public static void main(String[] args) {

        List<Integer> list1 = Demo();
        iteratorDemo(list1);
    }
    private static List<Integer> Demo() {
        List<Integer> list1 = null;
        try {
            list1 = new ArrayList<>();
            list1.add(3);
            list1.add(1);
            list1.add(2);
            list1.add(3);
            list1.add(null);
            list1.remove(4);
//            list1.remove(4);
            System.out.println("List1: " + list1);
            Collection<Integer> list2 = new ArrayList<>();
            list2.add(9);
            list2.add(3);
            list1.removeAll(list2);
            System.out.println("list1: " + list1);
            list2.add(1);
            list1.retainAll(list2);
            System.out.println("list1: " + list1);
            list1.addAll(list2);
            System.out.println("list1: " + list1);
            System.out.println("list1 contains(1): " + list1.contains(1));
            System.out.println("list1.index0f(1): " + list1.indexOf(1));
            System.out.println("list1,lastIndexOf(1): " + list1.lastIndexOf(1));
            System.out.println("list!: " + list1);
            List<Integer> list3 = list1.subList(2, 3);
            list3.set(0, 6);
            System.out.println("list1: " + list1);
            list3.add(0, 7);
            System.out.println("list1: " + list1);
            list1.set(2, 8);
            System.out.println("list3: " + list3);
            list1.add(0, 8);
            System.out.println("list1: " + list1);

//            for(int element: list1) {
//                System.out.println("element: "+ element);
//                if(element == 9) {
//                    list1.remove(Integer.valueOf(element));
//                }
//            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index value limit exceed");
        }
        return list1;
    }
    private static void iteratorDemo(List<Integer> list1) {
        System.out.println("\nInside iteratorDemp ... ");
        Iterator<Integer> iterator = list1.iterator();
        while(iterator.hasNext()) {
            int element = iterator.next();
            System.out.println("element: " + element);
            if(element == 9) {
                iterator.remove();
            }
        }
        System.out.println("list1: " + list1);
    }
}
