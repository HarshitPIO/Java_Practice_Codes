package abhyas.dayXV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HouseFinder {
    public static void main(String[] args) {
        List<String> houses = Arrays.asList("plot no 42, triveni ghat", "plot no. 21, new india","plot no. 45 jaipur");
        List<String> finder = houses.stream().filter(s ->s.contains("42")).collect(Collectors.toList());
        System.out.println(finder);
    }
}
