package day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class deneme {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
		
		
		System.out.println("With dubs"+list);
		System.out.println("NO   dubs"+removeDublicates(list));
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ayþe");
		names.add("Ali");
		names.add("Ali");
		names.add("Ayþe");
		names.add("Veli");
		names.add("Deli");
		names.add("Dseli");
		System.out.println(Collections.frequency(names, "Ayþe"));
//		for (int i = 0; i < names.size(); i++) {
//			if (Collections.frequency(names, names.get(i)) > 1) {
//
//			}
//			System.out.println(names.get(i).intern());
//			System.out.println(names.hashCode());
//		}
	}

	public static ArrayList<Integer> removeDublicates(ArrayList<Integer> list) {
		ArrayList<Integer> listWithoutDublicates = new ArrayList();
		for (int i : list) {
			if(!listWithoutDublicates.contains(i)) {
				listWithoutDublicates.add(i);
			}
		}
		return listWithoutDublicates;
	}

}
