package abhyas.dayXIV;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(21);
        list.add(30);
        list.add(43);
        list.add(50);
        list.add(60);
        AtomicInteger count = new AtomicInteger();
        List<Integer> ls = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println("printing the list after opertaion " +ls );
        List<Integer> ls2 = list.stream().map(i -> i+6).collect(Collectors.toList());
        System.out.println("Updated values are " + ls2);
        Optional<Integer> var = list.stream().reduce(Integer::sum);
        System.out.println(var);
        Map<Integer, Integer> mp = list.stream().collect(Collectors.toMap(i-> count.getAndIncrement(), i->i));
        System.out.println(mp);
    }
}
