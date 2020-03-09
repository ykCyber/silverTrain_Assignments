package assignment13;

import java.util.*;

public class Question80_Cricket_Scores {

	public static void main(String[] args) {
		short[] scores = { 51, 85, 32, 0, 98, 157, 82, 101, 64, 249 };
		int halfCentury = 0;
		int century = 0;
		int doubleCentury = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 50 && scores[i] < 100) {
				halfCentury++;
			}
			if (scores[i] >= 100 && scores[i] < 200) {
				century++;
			}
			if (scores[i] >= 200) {
				doubleCentury++;
			}
		}
		System.out.printf("Numbers of halfcentury %d\nNumbers of century %d\nNumbers of double century%d\n",halfCentury,century,doubleCentury);
}}
