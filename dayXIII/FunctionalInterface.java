package abhyas.dayXIII;

import com.sun.security.jgss.GSSUtil;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello supplier";
        System.out.println(supplier.get());
        Consumer<String> consumer = (customer) -> System.out.println("Message: "+ customer);
        consumer.accept("Hello Customer");
        Function<String, Integer> function = (str) -> str.length();
        System.out.println("Length of function: " + function.apply("function"));
    }
}
