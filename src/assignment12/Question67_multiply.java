package assignment12;

import java.util.ArrayList;

public class Question67_multiply {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(200);
		intList.add(100);
		timesTwo(intList);
		System.out.println(intList);
	}

	public static void timesTwo(ArrayList<Integer> intList) {
		for (int i = 0; i <intList.size(); i++) {
			intList.set(i,intList.get(i)*2);
		}
	}

}
