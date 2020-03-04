package assignment10;

public class Question16 {

	public static void main(String[] args) {
		/*Given a string word, print true if "java" appears starting at index 0 or 1 in the string, 
		 * such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". 
		The string should be 4 and more characters.*/
		boolean flag = containsJava("xxjavax");
		System.out.println(flag);
	}

	public static boolean containsJava(String string) {
		if(string.length()>3) {
		if (string.substring(0,4).equalsIgnoreCase("java")||string.substring(1,5).equalsIgnoreCase("java"))
		return true;
		else return false;}
		return false;
	}

}
