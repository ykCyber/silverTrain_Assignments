package assignment10;

public class Question25_Merge_Strings {

	public static void main(String[] args) {
		System.out.println(mergeStrings("12", "ab"));
	}

	public static String mergeStrings(String string, String string2) {
		String result = "";
		for (int i = 0; i < Integer.max(string.length(), string2.length()); i++) {
			
			if (string.length()>i) {
				result= result+string.charAt(i);
			}
			if (string2.length()>i) {
				result= result+string2.charAt(i);
		
			}
		}
		return result;
	}

}
