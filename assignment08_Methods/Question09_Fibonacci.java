package assignment08_Methods;

public class Question09_Fibonacci {

	public static void main(String[] args) {
		fib(9);
		System.out.println(fib(9));
		fib(9,9999);
	}

	public static int fib(int i) {
		if (i==1) return 0;
		if (i==2) return 1;
		return fib(i-2)+fib(i-1);
	}
	public static int fib(int i,int dummy) {
		int a = 0;
		int	b = 1;
		int c = 1;
		for (int j = 2; j < i-1; j++) {
			a=c+b;
			c=b;
			b=a;
			
		}
		System.out.println(b);
		return a;
		
	}

}
