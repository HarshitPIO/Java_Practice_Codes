package abhyas.dayXVII;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class ParallelExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Integer> number = new Random().ints(1,1000000).limit(1000000).boxed().collect(Collectors.toList());
        List<Integer> sortedNumber = number.stream().sorted().collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println( " Time taken:  "+ (endTime-startTime));
    }
}
