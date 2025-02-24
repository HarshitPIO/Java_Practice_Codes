package abhyas.dayX.Assignment2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayToLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(35);
        list.add(76);
        LinkedList<Integer> linkList = new LinkedList<>(list);
        System.out.println("Linked list: " + linkList);
        linkList.add(6,46);
        System.out.println("updated list: " + linkList);
        linkList.add(23);
        System.out.println("updated list: " + linkList);
        linkList.addFirst(78);
        System.out.println("updated list: " + linkList);
        linkList.addLast(90);
        System.out.println("updated list: " + linkList);
        linkList.remove(2);
        System.out.println("updated list: " + linkList);
        linkList.removeFirst();
        System.out.println("updated list: " + linkList);
        linkList.removeLast();
        System.out.println("updated list: " + linkList);
        linkList.remove(Integer.valueOf(12));
        System.out.println("after deleting: " + linkList);
    }


}
