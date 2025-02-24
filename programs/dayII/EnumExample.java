package abhyas.dayII;

import java.sql.SQLOutput;

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THRUSDAY,
    FRIDAY,
    SATURDAY;
}

public class EnumExample {
    Day day;
    public EnumExample(Day day) {
        this.day = day;
    }
    public void dayIsLike() {
        switch(day) {
            case MONDAY:
                System.out.println("week start work on");
                break;
            case FRIDAY:
                System.out.println("Weekends are coming");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Enjoy the weekends");
                break;
            default:
                System.out.println("keep working");
                break;
        }
    }

    public static void main(String[] args) {
        String str = "SATURDAY";
        EnumExample obj = new EnumExample((Day.valueOf(str)));
        obj.dayIsLike();
    }
}
