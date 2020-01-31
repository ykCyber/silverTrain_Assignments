package assignment03_Arithmetic_Operators;


public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Question-4
//		Declare 2 variables (Num1, Num2)
//		Swap values between Num1 and Num2
//		Display new values of Num1 and Num2
//		      Sample output:
//		      n1=10
//		      n2=20
//		      ----------
//		      n1=20
//		      n2=10
		int num1 = 5555, num2 = 6666;
		System.out.println("num1=" + num1 + "\r" + "num2=" + num2);
		System.out.println("-------");
		num1 =  num2+num1;
		num2 = -num2+num1;
		num1 = -num2+num1;
		System.out.println("num1=" + num1 + "\r" + "num2=" + num2);
					
				
      }
}
