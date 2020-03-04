package assignment10;

public class Question31_palindrome {

	public static void main(String[] args) {
		boolean flag = isPalindrome("adanada");
		System.out.println(flag);
	}
	public static boolean isPalindrome(String string) {
		StringBuffer str = new StringBuffer();
		str.append(string);
		return string.equalsIgnoreCase("" + str.reverse());
	}

}
