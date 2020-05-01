package CollectionsFrameWorks;

import assignment14.Question04.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingObjects {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("Adam");
        lst.add("Jhon");
        lst.add("Marry");
        lst.add("Diana");
        System.out.println(lst);
        Collections.sort((lst), Comparator.reverseOrder());
        System.out.println(lst);
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John",20));
        personList.add(new Person("John",15));
        personList.add(new Person("Adam",54));
        personList.add(new Person("Marry",10));
        System.out.println("personList = " + personList);
        Collections.sort(personList);
        System.out.println("personList = " + personList);

    }

}
