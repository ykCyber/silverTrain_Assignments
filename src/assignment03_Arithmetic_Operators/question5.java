package assignment03_Arithmetic_Operators;

public class question5 {

	public static void main(String[] args) {
		/*Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

		-Declare int variables inputSeconds, hours, minutes, seconds
		-Initialize the inputSeconds

		-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
		-Assign values to the hours, minutes, seconds variables
		-Display the result
			Sample Output:
			inputSecond is 3695
  			1 hours, 1 minutes, and 35 seconds*/
		// TODO Auto-generated method stub
		int inputSeconds = 123456, hours, minutes, seconds;
		hours   = inputSeconds/3600;
		minutes = (inputSeconds/60)%60;
		seconds = inputSeconds%60;
		System.out.println(hours+" hours "+minutes+" minutes"+" seconds "+seconds);
	}

}
