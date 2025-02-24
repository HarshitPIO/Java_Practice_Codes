package abhyas.dayIX;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> deque = new ArrayDeque<>();
        deque.add("Alan walker");
        deque.add("Ed Sheeren");
        deque.add("Justin Bieber");
        System.out.println(deque.remove());
        System.out.println(deque.remove());
        System.out.println(deque.remove());

    }
}
