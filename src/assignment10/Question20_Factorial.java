package assignment10;

public class Question20_Factorial {

	public static void main(String[] args) {
		// i tried to do via Recturisuon:)
		int result = f(5);
		System.out.println(result);
	}

	public  static int f(int i) {
		if (i==0) return 1;
		return i*f(i-1);
	}

}
