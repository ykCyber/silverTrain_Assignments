package assignment_6_ForLoop;

public class Question04_Sum {

	public static void main(String[] args) {
		int i, sum = 0, upperBond =11;
		for (i = 0; i <= upperBond; i++) {
			sum = i + sum;
		}
		System.out.println("From 0 to " +upperBond+ " sum of Numbers is  "+sum);
	}

}
