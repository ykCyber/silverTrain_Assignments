package assignment_6_ForLoop;

public class Question02_Fibonacci {

	public static void main(String[] args) {
		int a = 1, b = 1, serrie=0, n = 15;
		System.out.print(a+", "+a);
		for (int i = 0; i <= n; i++) {
			
			serrie=a+b;
			a=b;
			b=serrie;
			System.out.print(", "+serrie);
		}

	}
}
