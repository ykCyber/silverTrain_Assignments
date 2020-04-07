package WordGame;

import java.util.Random;
import java.util.Scanner;

public class game {

	public static StringBuffer dummy = new StringBuffer();
	static int i = 1;

	public game(int i2) {
		i = i2;
		startGame(i);
	}

	public void startGame(int i) {
		// TODO Auto-generated method stub
		String soru = answerQuestion.getQuestion(i);

		dummyCreat(answerQuestion.getAnswer(i));
		wantLetter(answerQuestion.getAnswer(i));

	}

	public static void dummyCreat(String question) {
		dummy.append("-".repeat(question.length()));
	}

	public static void wantLetter(String question) {
		System.out.println(answerQuestion.getQuestion(i));
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

	public static void addCharToDash(StringBuffer alfa, String question) {
		dummy = alfa;
		if (dummy.toString().equalsIgnoreCase(question)) {
			nextQuestion();
		} else {
			Random rn = new Random();
			int hintNumber = rn.nextInt(question.length()) + 0;

			if (dummy.charAt(hintNumber) == '-') {
				dummy.setCharAt(hintNumber, question.charAt(hintNumber));
				System.out.println(dummy);
			} else {
				addCharToDash(dummy, question);
			}
		}
		wantLetter(question);
	}

	private static void nextQuestion() {
		i++;
	}
}