package assignment11;

import java.util.Arrays;

public class Question37_GivenStringWriteFirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeFirstLastChar("hello", "why", "by", "apple" , "note");
	}

	public static void writeFirstLastChar(String... strings) {
		String arr[] = new String[strings.length];
		int j = arr.length - 1;
		for (int i = 0; i < strings.length; i++, j--) {

			arr[j] = (strings[i].substring(0, 1) + strings[i].charAt(strings[i].length() - 1));
		}
		System.out.println(Arrays.toString(arr));
	}
}
