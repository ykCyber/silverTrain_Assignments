package assignment12;

import java.util.ArrayList;
import java.util.Arrays;

public class Question64_CombineTwoStringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> wordList1 = new ArrayList<>(Arrays.asList("alfa","beta","charlie"));
		ArrayList<String> wordList2 = new ArrayList<>(Arrays.asList("delta","echo","fox"));
		ArrayList<String> combinedList = combineAl(wordList1,wordList2);
		System.out.println(combinedList);
	}

	public static ArrayList<String> combineAl(ArrayList<String> wordList1, ArrayList<String> wordList2) {
		ArrayList<String> combinedList = new ArrayList<String>(wordList1);
		combinedList.addAll(wordList2);
		return combinedList;
	}

}
