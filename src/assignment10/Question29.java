package assignment10;

public class Question29 {

	public static void main(String[] args) {
		String str = "abcd";
		System.out.println(subString(str, 2));

	}

	public static String subString(String str, int i) {
		str = str.substring(0, i);
		return str;
	}

}
