package abhyas.dayXV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new Employee("harshit",1,"ui"),
                new Employee("harshit",2,"java"),
                new Employee("jaya",3,"java"),
                new Employee("rahul",4,"kafka"),
                new Employee("saksham",5,"ui"),
                new Employee("vaibhav",6,"java"));
        List<String> lst = Arrays.asList("hello"," ", "world" ,"!");
        String lose = lst.parallelStream().collect(Collectors.joining());
        String win = emp.parallelStream().map(Employee::getName).collect(Collectors.joining(" "));
        System.out.println(win);
//        Map<String,List<Employee>> duplicate = emp.stream().collect(Collectors.groupingBy(e->e.getName()));
//        duplicate.forEach((name,listOfObj) ->{
//            System.out.println(name);
//            for(Employee e : listOfObj ){
//                System.out.println(e);
//            }
//        });


//        System.out.println(duplicate);

        Map<String, String> group = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.joining(", "))));
//        group.forEach((department,name) -> System.out.println("Department: " + department + " Names: "+ name));
    }

}
