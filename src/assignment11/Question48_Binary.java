package assignment11;

import java.util.Arrays;

public class Question48_Binary {

	public static void main(String[] args) {
		int i = 128;
		int binaryArray[] = toBinary(i);
		System.out.println(Arrays.toString(binaryArray));
	}

	public static int[] toBinary(int i) {
		int binaryArray[] = new int[8];
		for (int j = binaryArray.length - 1; j >= 0; j--) {
				binaryArray[j] = i % 2;
				System.out.println(j);
				if (i  <= 1) {
				binaryArray[j] = i ;
					
					break;}
				i=(i/2);
			}
		
		return binaryArray;
	}
}
