package assignment12;

import java.util.ArrayList;

public class Question69 {

	public static void main(String[] args) {
		boolean flag1 = true;
		boolean flag2 = false;
		boolean flag3 = false;
		ArrayList<Boolean> booleans = new ArrayList<Boolean>();
		booleans.add(flag1);
		booleans.add(flag2);
		booleans.add(flag3);
		repeatAl(booleans);
		System.out.println(booleans);
	}

	public static void repeatAl(ArrayList<Boolean> booleans) {
		System.out.println(booleans);
		booleans.addAll(booleans);
		System.out.println(booleans);
	}

}
