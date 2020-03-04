package assignment12;

import java.util.Arrays;

public class Question60 {

	public static void main(String[] args) {
		String []str1 = {"f","o","o"};
		String[] str2	= {" b","a","r"};
		String combined =combineRs(str1,str2);
		System.out.println(combined);
	}

	public static String combineRs(String[] str1, String[] str2) {
		StringBuilder combined = new StringBuilder();
		for (int i = 0; i < str1.length; i++) {
			combined.append(str1[i]);
		}
		for (int i = 0; i < str2.length; i++) {
			combined.append(str2[i]);
		}
		return combined.toString();
		
	}

}
