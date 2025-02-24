package abhyas.dayIII;

import java.util.Arrays;
import java.util.List;

public class WildClassExample {
    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(1,2.2,22)));
    }
    public static double sum(List<? extends Number> numbers ){
        double sum=0;
        for(Number o: numbers) {
            sum+= o.doubleValue();
        }
        return sum;
    }
}
