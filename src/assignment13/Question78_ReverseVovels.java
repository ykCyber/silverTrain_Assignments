package assignment13;

import java.util.ArrayList;
import java.util.Arrays;

public class Question78_ReverseVovels {

	public static void main(String[] args) {
		String str = "hello world";
		String vovelRevesed = reverse(str);
		System.out.println(str);
		System.out.println(vovelRevesed);
	}

	private static String reverse(String str) {
		ArrayList<String> vovels = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));
		String vovelRevesed = "";
		ArrayList<String> vovelsOfGivenString = new ArrayList<String>();
		for (int i = 0; i < str.length(); i++) {
			if (vovels.contains("" + str.toLowerCase().charAt(i))) {
				vovelsOfGivenString.add("" + str.charAt(i));
				;
			}
		}
		int counter = vovelsOfGivenString.size() - 1;
		for (int i = 0; i < str.length(); i++) {
			if (vovels.contains("" + str.toLowerCase().charAt(i))) {
				vovelRevesed = vovelRevesed + ("" + vovelsOfGivenString.get(counter--));
			} else
				vovelRevesed = vovelRevesed + ("" + str.charAt(i));
		}
		return vovelRevesed;
	}

}
