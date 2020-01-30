package assignment_4_If_StatementsSwitchStatement;

import java.util.Scanner;

public class Question2_Tax_Calculator{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your income..:");
		
		int income = sc.nextInt(); 
		double tax1 = 0,tax2 = 0,tax3 = 0,tax4 = 0,tax5 = 0;//tax brackets
		double r1=0.25d, r2=0.30d, r3=0.35, r4=0.40,r5=0.5;//tax bands
	  if (income<=150_000) {
		  tax1=income*r1;
		  System.out.println("you are at tax bracket 1 --<150K");
		  System.out.println("Your tax  :"+tax1);
	  } else if (income>150_000&income<=300_000) {
		  System.out.println("you are at tax bracket 2 150K>--<300K");
		  tax2=(income%150_000)*r2+150_000*r1;
		  System.out.println("Your tax :"+tax2);
	  }  else if (income>300_000&income<=600_000) {
		  System.out.println("you are at tax bracket 3 300K>--<600K");
		  tax3=(income%450_000*r3)+150_000*r2+150_000*r3;
		  System.out.println("Your tax :"+tax3);
	  }	else if (income>600_000&income<=1_200_000) {
		  System.out.println("you are at tax bracket 4 600K>---<1200K");
		  tax4=(income%1_050_000*r4)+150_000*r1+150_000*r2+300_000*r3;
		  System.out.println("Your tax :"+tax4);
	  } else if (income >1_200_000) {
		  System.out.println("you are at tax bracket 5 >1200K");
		  tax5=(income%1_200_000)*r5+150_000*r1+150_000*r2+300_000*r3+600_000*r4;
		  System.out.println("Your tax :"+tax5);
	  }	  
	  
	  
	  System.out.println("Your income..:"+income);System.out.println("Net Result...:"+(income-tax5-tax4-tax3-tax2-tax1));
		  
		 
		sc.close();
		
	}

}
