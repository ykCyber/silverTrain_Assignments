package Iterator;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.*;

public class IterExample {
    public static void main(String[] args) {
        String[] data = new String[4];
        data[0] = "200";
        data[1] = "301";
        data[2] = "404";
        data[3] = "500";
        List<String> yeniList = new ArrayList<>();
        yeniList.add("a");
        yeniList.add("b");
        yeniList.add("c");
        yeniList.add("d");
        yeniList.add("e");

        ListIterator<String> stringIterator0 = yeniList.listIterator();
        List<String> list = Arrays.asList(data);
        ListIterator<String> stringIterator = list.listIterator();
        System.out.println("stringIterator.next() = " + stringIterator.next());
        System.out.println("stringIterator.next() = " + stringIterator.next());
        stringIterator.forEachRemaining(s -> {

        });
        System.out.println("stringIterator.previous() = " + stringIterator.previous());
        System.out.println("stringIterator.previous() = " + stringIterator.previous());
        System.out.println("stringIterator.previous() = " + stringIterator.previous());
        System.out.println("stringIterator.previous() = " + stringIterator.previous());
        stringIterator.forEachRemaining(s -> {
            System.out.println("s = " + s);
            System.out.println("stringIterator = " + stringIterator.nextIndex());
        });

        //  dataStringIterator.remove();
    }
}
