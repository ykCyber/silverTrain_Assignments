package assignment03_Arithmetic_Operators;

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
		/*Question-6
		Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.
		Write a program with a variable that holds the
		number of milligrams of caffeine in a drink and outputs how many drinks it takes to kill a person.
		A 12-ounce 340gr can of cola has approximately 34 mg of caffeine, 
		while a 16-ounce 450 grcup of coffee has approximately 160 mg of caffeine.
		In one gram there is 1000 mg.
        1once 	28.35 g
        Sample Output
        Number of milligrams in drink: 500
	    It would take about 20 drinks for a lethal overdose*/
		System.out.println("Please enter in miligrams How much coffeine contains a cup of your drink?");
		Scanner sc = new Scanner(System.in);
		int caffeine= sc.nextInt();
		sc.close();
		int overDose = 10_000 / caffeine;
		System.out.println("If you drink "+overDose+" cups ☠☠YOU DIE☠☠!!");
		System.out.println((overDose-1)+" cups are fine ");
		
	
	}

}
