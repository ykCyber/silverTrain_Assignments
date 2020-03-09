package assignment13;

import java.util.*;

public class Question76_TwoTimes {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(10);
		arr.add(-500);
		ArrayList<Integer> arrNew = twoTimes(arr);
		System.out.println(arrNew);
	}

	private static ArrayList<Integer> twoTimes(ArrayList<Integer> arr) {
		ArrayList<Integer> arrNew = new ArrayList<>();
		for (int i = 0; i < arr.size(); i++) {
			arrNew.add(arr.get(i));
			arrNew.add(arr.get(i));
		}
		return arrNew;
	}
}
