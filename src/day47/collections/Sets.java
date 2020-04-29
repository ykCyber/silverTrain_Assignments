package day47.collections;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
//        List<Object> list = (List<Object>) new HashSet<Object>();
//        list
        List<String> list = Arrays.asList("23", "a", "b", "c", "12", "d", "asd", "asd");
        TreeSet<Integer> integers = new TreeSet<>();
        int[] alfa = new int[]{1,2,3};
        int beta =5;
        integers.add(beta);
        System.out.println("integers.isEmpty() = " + integers.isEmpty());
        for (Integer integer : integers) {
            System.out.println("integer.toString() = " + integer.toString());
        }
    }
}
