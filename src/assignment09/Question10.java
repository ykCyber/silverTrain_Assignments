package assignment09;

public class Question10 {

	public static void main(String[] args) {
		userInfo("mike_tyson@gmail.com");
	}

	public static void userInfo(String string) {
		//mike_tyson@gmail.com
		String[] arr1 = new String[2];
		
		arr1 = string.split("@");//a1.0-> mike_tyson    a1.1-> gmail.com 
		
		String[] arr2 = new String[2];
		arr2 = arr1[0].split("_");
		
		String[] arr3 = new String[2];
		arr3 = arr1[1].split("\\.");//
		String domain =	arr3[0];
		String topLevelDomain =	arr3[1];
		
		String name = firstCharToUpper(arr2[0]);
		String surName = firstCharToUpper(arr2[1]);
		System.out.printf("First Name       : %s\n"
				+ "Surname          : %s\n"
				+ "Domain           : %s\n"
				+ "Top-Level Domain : %s"
				,name,surName,domain,topLevelDomain);
	}

	private static String firstCharToUpper(String string) {
		String capitalized = string.substring(0,1).toUpperCase()+string.substring(1);
		return capitalized;
		
	}

}
