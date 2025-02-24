package abhyas.dayVIII;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.TreeMap;
import java.util.TreeSet;

public class TaskScheduler {
    public static void main(String[] args) {
        TreeSet<String> taskNames = new TreeSet<>();
        TreeMap<LocalDate, TreeSet<String>> tasks = new TreeMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String taskName = "Complete java Project";
        System.out.println(taskName);
        LocalDate dueDate = LocalDate.parse("2025-02-05", formatter);
        if(taskNames.add(taskName)) {
            tasks.computeIfAbsent(dueDate, k -> new TreeSet<>()).add(taskName);
            System.out.println("task added");
        }
        else {
            System.out.println("task already exist");
        }
        String taskName2 = "Prepare for presentation";
        LocalDate dueDate2 = LocalDate.parse("2025-02-06", formatter);
        if(taskNames.add(taskName2)) {
            tasks.computeIfAbsent(dueDate2,k -> new TreeSet<>()).add(taskName2);
            System.out.println("task added");
        }
        else {
            System.out.println("task already exist");
        }
        if(tasks.isEmpty()) {
            System.out.println("No task scheduled");
        } else {
            System.out.println("scheduled task: ");
            tasks.forEach((date,taskSet) -> {
                System.out.println(date+ ": " + String.join(", ", taskSet));
            });
        }
    }
}
