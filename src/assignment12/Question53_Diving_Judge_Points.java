package assignment12;

import java.util.Scanner;

public class Question53_Diving_Judge_Points {

	public static void main(String[] args) {
		calculatePoint();

	}

	public static void calculatePoint() {
		float[] score = new float[7];
		Scanner sc = new Scanner(System.in);
		float maxPoint = Float.MIN_VALUE;
		float minPoint = Float.MAX_VALUE;
		float totalPoint = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.print("Enter score for judge " + (i + 1));
			score[i] = sc.nextFloat();
			maxPoint = Math.max(maxPoint, score[i]);
			minPoint = Math.min(minPoint, score[i]);
			totalPoint = totalPoint + score[i];
		}
		totalPoint = totalPoint - maxPoint - minPoint;
		float difPoint;
		label1: while (true) {
			System.out.println("Enter difficulty");
			difPoint = sc.nextFloat();
			if (difPoint < 3.8 && difPoint > 1.2) {
				break label1;
			} else {
				System.out.println("Enter a value between 1.2 & 3.8");
			}
			}
			totalPoint = (float) (totalPoint * difPoint * 0.6);
			System.out.printf("Total: %.2f", totalPoint);
			sc.close();
	}
}
