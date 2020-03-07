package assignment13;

import java.util.ArrayList;
import java.util.Arrays;

public class Question74_RemoveInstance {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 5, 1, 200, 10));
		System.out.println(arr);
		ArrayList<Integer> arrNew = removeInstance(arr, 1);
		System.out.println(arrNew);
	}

	public static ArrayList<Integer> removeInstance(ArrayList<Integer> arr, int i) {
		
		ArrayList<Integer> arrToremove=new ArrayList<>(Arrays.asList(i));
		arr.removeAll(arrToremove);
		return arr;

	}

}
