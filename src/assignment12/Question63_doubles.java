package assignment12;

import java.util.ArrayList;

public class Question63_doubles {

	public static void main(String[] args) {
		ArrayList<Double>first = new ArrayList<Double>();
		first.add(1.2);
		first.add(2.3);
		first.add(4.5);
		first.add(5.6);
		System.out.println(first);
		doubles(first);
	}

	public static void doubles(ArrayList<Double> first) {
		first.remove(0);
		first.remove(0);
		System.out.println(first);
		
	}

}
