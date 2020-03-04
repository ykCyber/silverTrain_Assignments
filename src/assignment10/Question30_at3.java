package assignment10;

public class Question30_at3 {

	public static void main(String[] args) {

		String str = "longword";
		String str1 = "foo";
		String str2 = at3(str, str1);
		System.out.println(str2);
	}

	public static String at3(String str, String str1) {
		String charToReplace = "" + str.charAt(3);
		str1 = str1 + charToReplace;
		str= str.replaceFirst(charToReplace, str1);
		return str;
	}

}
