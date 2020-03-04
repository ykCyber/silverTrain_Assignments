package assignment10;

public class Question17 {

	public static void main(String[] args) {
		writeAlphabeticOrder('A','Z');

	}

	public static void writeAlphabeticOrder(char c, char d) {
		for (int i = c; i <=d; i++) {
			System.out.print((char)i);
			
		}
	}

}
