package assignment09;

public class Question12 {

	public static void main(String[] args) {
		String str="XalfaX";
		System.out.println(removeFirstAndLastXx(str));
		
	}

	private static String removeFirstAndLastXx(String str) {
		if(str.substring(0,1).equalsIgnoreCase("x")) {
			str=str.substring(1);
		}
		if(str.substring((str.length()-1)).equalsIgnoreCase("x")) {
			str=str.substring(0,str.length()-1);
		}
		return str;
	}
}
