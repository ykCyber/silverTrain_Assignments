package assignment11;

import java.util.Arrays;

public class Question51_Inner_Outer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inner = { 2, 4, 1, 10 };
		int[] outer = { 1, 2, 7, 4, 6, 10 };
		int counter = 0;
		for (int i = 0; i < inner.length; i++) {
			for (int j = 0; j < outer.length; j++) {
				if (inner[i] == outer[j]) {
					counter++;
				}
			}
		}
		System.out.println(counter == inner.length);
	}

}
