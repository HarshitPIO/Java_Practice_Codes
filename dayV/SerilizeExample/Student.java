package abhyas.dayV.SerilizeExample;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID  = 1L;
    transient String name;
    int age;
    int roll;
    String city;
    String email;

    public Student() {
    }

    Student(String name, int age, int roll, String city, String email) {
        this.name = name;
        this.age = age;
        this.roll = roll;
        this.city = city;
        this.email = email;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public int getRoll() {

        return roll;
    }

    public String getCity() {

        return city;
    }
    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setRoll(int roll) {

        this.roll = roll;
    }

    public void setCity(String city) {

        this.city = city;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void displayName() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.roll);
        System.out.println(this.city);
        System.out.println(this.email);
    }
}
