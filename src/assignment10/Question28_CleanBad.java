package assignment10;

public class Question28_CleanBad {
public static void main(String[] args) {
	System.out.println(remove("alfa beta","a"));
}

public static String remove(String string, String string2) {
	return string.replace(string2,"" );
}
}
