package assignment11;

import java.util.Arrays;

public class Question47_ZombiAttact {

	public static void main(String[] args) {
		int[] population = { 3, 6, 0, 7, 3, 2, 7, 1 };
		extincDay(population);
	}

	public static void extincDay(int[] population) {
		int []checkZero=new int[8];
		System.out.println(Arrays.toString(population));
		while (true) {
			for (int i = 0; i < population.length; i++) {
				population[i]=population[i]/2;
			}
			System.out.println(Arrays.toString(population));
			if(Arrays.equals(population, checkZero))break;
		}
		System.out.println("---- EXTINCT ----");
	}

}
