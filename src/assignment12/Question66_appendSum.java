package assignment12;

import java.util.ArrayList;

public class Question66_appendSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(4);
		intList.add(-6);
		intList.add(3);
		intList.add(-8);
		intList.add(0);
		intList.add(4);
		intList.add(3);
		ArrayList<Integer> newList = appendPosSum(intList); 
		System.out.println(newList);
	}

	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> intList) {
		ArrayList<Integer> newList = new ArrayList<Integer>(); 
		int counter=0;
		for (int i = 0; i < intList.size(); i++) {
			if (intList.get(i)>-1) {
				newList.add(intList.get(i));
				counter++;
				newList.set(i, intList.get(i));
			}
			newList.set(newList.size()-1, counter);
		}
		return newList;
	}

}
