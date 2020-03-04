package assignment11;

import java.util.Arrays;


public class Question42_RemoveItemsWitoutE{

	public static void main(String[] args) {
		String arr[] = { "e", "hey", "bye", "furey", "spoon" };
		fewValues(arr);
	}
		public static void fewValues(String...arr) {
			
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("e"))
				counter++;
		}
		String fewValues[] = new String[counter];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("e")) {
				fewValues[j] = arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(arr)+"\n"+Arrays.toString(fewValues));
	}
}

