package lab3Cont;

public class Question17isPalindrome {

	public static void main(String[] args ) {
		String str= "Able was I ere I saw Elba";
		isPalindrome( str);
	}

	public static boolean isPalindrome(String str) {
		StringBuilder sb =new StringBuilder("");
		for (int i = str.length()-1; i >=0 ; i--) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb.toString().equalsIgnoreCase(str));
		return sb.toString().equalsIgnoreCase(str);
	}

}
