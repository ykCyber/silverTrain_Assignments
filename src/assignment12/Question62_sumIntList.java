package assignment12;

import java.util.ArrayList;

public class Question62_sumIntList {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(200);
		intList.add(100);
		int total = sum(intList);
		System.out.println(total);
	}

	public static int sum(ArrayList<Integer> intList) {
		int total = 0;
		for (Integer integer : intList) {
			total = total + integer;
		}
		return total;
	}

}
