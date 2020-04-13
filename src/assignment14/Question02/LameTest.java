package assignment14.Question02;

public class LameTest extends LameCalculator {


	public static void main(String[] args) {
		LameCalculator lc = new LameCalculator();
		System.out.println("plus:" + lc.plus(1, 1));
		System.out.println("minus:" + lc.minus(1, 1));
		System.out.println("multiply:" + lc.multiply(2, 1));
		System.out.println("divide:" + lc.divide(10, 2));
	}

}
