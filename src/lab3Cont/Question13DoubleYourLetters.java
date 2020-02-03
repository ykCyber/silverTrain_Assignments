package lab3Cont;

public class Question13DoubleYourLetters {

	public static void main(String[] args) {
		System.out.println(doubleChar("Ahmet"));
	}

	public static String doubleChar(String str) {
		StringBuilder sb = new StringBuilder("");
		
		for (int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i)).append(str, i, i + 1);
		}
		return sb.toString();
	}


}