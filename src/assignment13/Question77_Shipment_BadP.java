package assignment13;

import java.util.*;

public class Question77_Shipment_BadP {

	public static void main(String[] args) {
		Integer arr[] = { 1, 1, 0, 0, 0, 0 };
		int limit = 2;
		System.out.println(badP(arr, 0));
		System.out.println(badP(arr, 1));
		System.out.println(badP(arr, 2));
		System.out.println(badP(arr, 3));
		System.out.println(badP(arr, 4));
		System.out.println(badP(arr, 5));
		System.out.println(badP(arr, 6));
	}

	public static boolean badP(Integer[] arr, int limit) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
		
		return (Collections.frequency(list, 0) <= limit);
	}
}
