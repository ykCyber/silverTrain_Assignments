package assignment09;

public class Question07 {

	public static void main(String[] args) {
		firstHalfTwice("apple");
	}

	public static void firstHalfTwice(String string) {
		 System.out.println((string.substring(0,string.length()/2)).repeat(2));
	}

}
