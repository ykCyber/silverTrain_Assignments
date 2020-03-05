package assignment12;

import java.util.ArrayList;
import java.util.Arrays;

public class Question65 {

	public static void main(String[] args) {
		ArrayList<String> originalStringList = new ArrayList<>(Arrays.asList("alfa","beta","charlie","delta","echo","alfa"));
		System.out.println(originalStringList);
		removeAll(originalStringList,"beta");
		System.out.println(originalStringList);
	}

	public static void removeAll(ArrayList<String> originalArrayList, String string) {
		
		ArrayList<String> toRemove = new ArrayList<>(Arrays.asList(string));
		originalArrayList.removeAll(toRemove);
	}

}
