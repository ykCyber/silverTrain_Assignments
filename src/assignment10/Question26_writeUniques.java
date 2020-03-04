package assignment10;

public class Question26_writeUniques {

	public static void main(String[] args) {
		String str = uniques("java");
		System.out.println(str);
	}

	public static String uniques(String string) {
		String result = "";
		int numReplaced;
		int lenght = string.length();
		for (int i = 0; i < string.length(); i++) {
			String alfa = "" + string.charAt(i);
			numReplaced = lenght - (string.replace(alfa, "").length());
			if (numReplaced ==1) {
				result = result + string.charAt(i);
			}
		}
		return result;
	}
}
