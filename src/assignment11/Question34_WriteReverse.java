package assignment11;

public class Question34_WriteReverse {

	public static void main(String[] args) {
		writeReverse("Hello! Java is very Fun");
	}

	public static void writeReverse(String string) {
		Object []alfa = string.split(" ");
		for (int i = alfa.length-1;  i>=0; i--) {
			System.out.println(alfa[i]);
		}
	}
}
