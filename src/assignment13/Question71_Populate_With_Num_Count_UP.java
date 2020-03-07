package assignment13;

import java.util.Arrays;

public class Question71_Populate_With_Num_Count_UP {

	public static void main(String[] args) {
			System.out.println(Arrays.toString(populate(new int[5])));
	}

	public static int[] populate(int[] is) {
		for (int i = 0; i < is.length; i++) {
			is[i]=i+1;
		}
		return is;
	}

}
