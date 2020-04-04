package WordGame;

import java.util.Random;
import java.util.Scanner;

public class game {
	static StringBuffer dummy = new StringBuffer();

	public static void main(String[] args) {
		String question = "eclipse";
		dummyCreat(question);
		wantLetter(question);
	}

	public static void dummyCreat(String question) {
		dummy = dummy.append("*".repeat(question.length()));
	}

	public static void wantLetter(String question) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Harf almak istiyormusun E/H");
		String answer = sc.nextLine();
		if (answer.equalsIgnoreCase("e")) {
			addCharToDash(dummy, question);
		} else {
			enterAnswer(question);
		}
	}

	private static void enterAnswer(String question) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cevabı giriniz");
		String answer = sc.nextLine();
		if (answer.equalsIgnoreCase(question)) {
			System.out.println("Doğru Cevap");
			calculatePoint(question);
		} else {
			System.out.println("Yanlış cevap");
		}
		nextQuestion();
	}

	private static void calculatePoint(String question) {

	}

	public static void addCharToDash(StringBuffer dummy, String question) {
		if (dummy.toString().equalsIgnoreCase(question)) {
			nextQuestion();
		}
		Random rn = new Random();
		int hintNumber = rn.nextInt(question.length()) + 0;

		if (dummy.charAt(hintNumber) == '-') {
			dummy.setCharAt(hintNumber, question.charAt(hintNumber));
			System.out.println(dummy);
		} else {
			addCharToDash(dummy, question);
		}
		wantLetter(question);
	}

	private static void nextQuestion() {
		System.out.println("NextQuestion Methodu yazılacak");
	}
}
