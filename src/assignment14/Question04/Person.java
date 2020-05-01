package assignment14.Question04;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person> {
    public static int alfa = 155;
    public static String name = "CyberTek";
    public String FirstName = "mike";
    public int age;
    String lastName;

    public Person() {
        this.age = -1;
        this.FirstName = "undefined";
        this.lastName = "undefined";
    }

    public Person(String firstName, String lastName, int age) {
        this.FirstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, int age) {
        this();
        this.FirstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstaName) {
        this.FirstName = firstaName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[firstName=" + FirstName + " age ="+this.age+",   lastName=" + lastName + "]";
    }

    @Override
    public int compareTo(@NotNull Person o) {

//        if (this.FirstName.charAt(0) > o.FirstName.charAt(0)) {
//            return 1;
//        } else if (this.FirstName.charAt(0) == o.FirstName.charAt(0)) {
//            if (this.age > o.age) {
//                return -1;
//            } else if (this.age == o.age) {
//                return 0;
//            } else
//                return 1;
//        } else {
        return (this.FirstName.compareTo(o.FirstName) == 0)
                ? -1*Integer.compare(this.age, o.age)
                : this.FirstName.compareTo(o.FirstName);
        }
    }

