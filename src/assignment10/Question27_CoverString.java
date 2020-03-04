package assignment10;

public class Question27_CoverString {

	public static void main(String[] args) {
		coverString("Certified Wooden Spoon", "o") ;
	}

	public static void coverString(String string, String string2) {
		String str  = "["+string2+"]";
		System.out.println(string.replace(string2, str));
	}

}
