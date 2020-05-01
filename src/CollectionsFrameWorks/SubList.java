package CollectionsFrameWorks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SubList {
    public static void main(String[] args) {

    List<Double> doubleList = new ArrayList<>(Arrays.asList(1d, 2d, 56d, 44d, 45.5, 77.9, 9.8));
        System.out.println("doubleList = " + doubleList);
        List<Double> partofList = doubleList.subList(2, 5);
        partofList.set(0, 9999.999999d);
        System.out.println("partofList = " + partofList);
        System.out.println("doubleList = " + doubleList);


    }
}
