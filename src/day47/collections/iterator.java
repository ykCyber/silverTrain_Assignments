package day47.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {
    private static Object Consumer;

    public static void main(String[] args) {
        List<String> city = new ArrayList<>();
        city.add("elma");
        city.add("armut");
        city.add("beta");
        Iterator<String> stringIterator = city.iterator();
        //stringIterator.forEachRemaining(new asd());
    }
}
