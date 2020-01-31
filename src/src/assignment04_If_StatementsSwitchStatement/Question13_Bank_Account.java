package src.assignment04_If_StatementsSwitchStatement;

import java.util.Scanner;

public class Question13_Bank_Account {
//**// $.10 each for less than 20 checks
//
//    $.08 each for 20-39 checks  
//
//    $.06 each for 40-59 checks
//
//    $.04 each for 60 or more checks*****///*//
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of checks :");
		int check = sc.nextInt();
		float bill = 0,		fixed = 10.0f;
		if (check>0 && check <= 19) {
			bill = fixed+check*0.1f;
		} else if (check > 19 && check <= 39) {
			bill = check * 0.08f + fixed;
		} else if (check> 39 && check <=59) {
			bill= check *0.06f + fixed;			
		} else if (check>59)
			bill= check*0.04f+fixed;
		else {
			System.out.println("Enter a valid number");
		}
		System.out.println("Bill: $"+bill);
		sc.close();
		
	}

}
