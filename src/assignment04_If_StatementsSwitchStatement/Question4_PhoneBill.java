package assignment04_If_StatementsSwitchStatement;

import java.util.Scanner;

public class Question4_PhoneBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total calls...:");
		int calls = sc.nextInt();
		float bill = 0,		fixed = 200.0f;
		if (calls>0 && calls <= 100) {
			bill = fixed;
		} else if (calls > 100 && calls <= 150) {
			bill = (calls - 100) * 0.6f + fixed;
		} else if (calls> 150 && calls <=200) {
			bill= (calls-150) *0.5f + 230.0f;//$230=$200fixed+$0,6X50			
		} else if (calls>200)
			bill= (calls-200)*0.4f+280.0f;
		else {
			System.out.println("Enter a valid CALL number");
		}
		System.out.println("Bill: $"+bill);
		sc.close();
	}

}
