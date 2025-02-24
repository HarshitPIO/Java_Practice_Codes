package abhyas.dayXVI.Assignment3;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Workable {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("harshit", 12),
                new Person("abdul", 21),
                new Person("jaya", 20),
                new Person("Rahul", 22),
                new Person("vaibhav", 24),
                new Person("saksham", 26)
        );
        List<Product> list1 = Arrays.asList(
                new Product("harshit", 12.1),
                new Product("abdul", 21.2),
                new Product("jaya", 20.3),
                new Product("rahul", 22.4),
                new Product("vaibhav", 24.5),
                new Product("saksham", 26.6)
        );
        List<Orders> list3 = Arrays.asList(
                new Orders(1, 12.1),
                new Orders(2, 21.2),
                new Orders(3, 20.4),
                new Orders(4, 22.5),
                new Orders(5, 24.6),
                new Orders(6, 26.6)
        );
        List<Student> list4 = Arrays.asList(
                new Student("harshit", 32),
                new Student("abdul", 71),
                new Student("jaya", 48),
                new Student("Rahul", 59),
                new Student("vaibhav", 34),
                new Student("saksham", 26)
        );
        List<Employee> list5 = Arrays.asList(
                new Employee("harshit", 12),
                new Employee("abdul", 21),
                new Employee("jaya", 20),
                new Employee("Rahul", 22),
                new Employee("vaibhav", 24),
                new Employee("saksham", 26)
        );
        long count = list5.stream().count();
        System.out.println("Total no. of employees: " + count);

        List<Student> topper = list4.stream().filter(s->s.getMarks()>=50).collect(Collectors.toList());
        topper.forEach(System.out::println);

        double sum = list3.stream().collect(Collectors.summingDouble(Orders::getAmount));
        System.out.println("total sum: " + sum);

        List<String> names = list1.stream().map(Product::getProductName).sorted().collect(Collectors.toList());
        System.out.println(names);

        int old = list.stream().map(Person::getAge).max(Integer::compare).get();
        System.out.println(list
                .stream()
                .filter(st -> st.getAge() == old)
                .map(st -> st.getName() + " " + st.getAge())
                .collect(Collectors.toList()));

//        List<String> names = list1.stream().flatMap(st ->st.getPrice()).collect(Collectors.toList());
//        System.out.println("Highest age: " + old);

//        System.out.println(Stream.of(
//                        list5.stream().map(employee -> employee.getName()).collect(Collectors.toList()),
//                        list5.stream().map(employee -> employee.getAge()).collect(Collectors.toList())
//                )
//                .flatMap(Collection::stream)
//                .collect(Collectors.toList()));
    }

}
