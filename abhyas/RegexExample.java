package abhyas;

import java.util.regex.*;
public class RegexExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("llo");
        Matcher matcher = pattern.matcher("Hello");
        boolean found = matcher.find();
        System.out.println("found " + found);
    }
}
