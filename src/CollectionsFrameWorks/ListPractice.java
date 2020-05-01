package CollectionsFrameWorks;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        List<Double> lst = new LinkedList<> (Arrays.asList(3d, 5d, 6d, 7d, 66d, 55d));

        System.out.println("first item " + lst.get(0));
        lst.add(0,5.);
        System.out.println("first item " + lst.get(0));
        lst.set(0, 34.);
        System.out.println("first item " + lst.get(0));
        System.out.println("lst.indexOf(66.0) = " + lst.indexOf(66.0));
        System.out.println("lst.remove(3.0) = " + lst.remove(3));
        lst.replaceAll(each-> each+5);
        System.out.println(lst);
        lst.sort(null);
        System.out.println("lst = " + lst);
        lst.sort(Comparator.reverseOrder());
        System.out.println("lst = " + lst);
        lst.sort(Comparator.naturalOrder());
        System.out.println("lst = " + lst);
    }
}
