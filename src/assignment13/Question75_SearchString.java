package assignment13;

import java.util.ArrayList;
import java.util.Arrays;

public class Question75_SearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList(Arrays.asList("one apple", "two orange", "four banana"));
		String searchWord = "four";
		String searchResult = search(str, searchWord);
		System.out.println("Result :" + searchResult);
	}

	public static String search(ArrayList<String> str, String searchWord) {
		System.out.println(str);
		System.out.println("Search Word :" + searchWord);
		String result = "search failed";
		String splited[];
		;
		for (int i = 0; i < str.size(); i++) {
			splited = str.get(i).split(" ");
			for (int j = 0; j < splited.length; j++) {
				if (splited[j].equalsIgnoreCase(searchWord)) {
					result = str.get(i);
					break;
				}
			}
		}
		return result;
	}
}
