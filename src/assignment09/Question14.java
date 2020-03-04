package assignment09;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		carInsurance();
	}

	public static void carInsurance() {
		double barePremium = 0;
		Scanner sc = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);

		System.out.print("Welcome to the CountyFarm car insurance!\nEnter your name:");
		String name = scString.nextLine();
		String licience;
		do {
			System.out.print("Do you have a US driver licience (Yes/No)?");
			licience = scString.nextLine();
		} while (!(licience.equalsIgnoreCase("yes") || licience.equalsIgnoreCase("no")));
		if (licience.equalsIgnoreCase("no")) {
			System.out.println("Invalid Data Program Stopped");
			System.exit(0);
		}
		System.out.println("Enter your zip code");
		int zip = sc.nextInt();
		barePremium = (zip == 20910 || zip == 20740) ? 60 : (zip == 22102 || zip == 22103) ? 30 : 50;
		String owner;
		int ownerCharge;
		do {
			System.out.println("Is this vehicle Owned, Financed, or Leased?");
			owner = scString.nextLine();
		} while (!(owner.equalsIgnoreCase("owned") || owner.equalsIgnoreCase("financed")
				|| owner.equalsIgnoreCase("leased")));
		if (owner.equalsIgnoreCase("owned")) {
			ownerCharge = 10;
		} else {
			ownerCharge = 20;
		}
		barePremium= barePremium+ownerCharge;
		int usedTypeCharge;
		String usedTypeS;
		do {
			System.out.println("How is this vehicle primarily used?" + "Business / Pleasure / Commute? ");
			usedTypeS = scString.nextLine();
		} while (!(usedTypeS.equalsIgnoreCase("Business") || usedTypeS.equalsIgnoreCase("Pleasure")
				|| usedTypeS.equalsIgnoreCase("Commute")));
		if (usedTypeS.equalsIgnoreCase("Business")) {
			usedTypeCharge = 50;
		} else if (usedTypeS.equalsIgnoreCase("Pleasure")) {
			usedTypeCharge = 10;
		} else {
			usedTypeCharge = 20;}
		barePremium=barePremium+usedTypeCharge;
		int dailyCharge=0;
		int milesCharge = 0;
		if (!usedTypeS.equalsIgnoreCase("Pleasure")) {
		System.out.print("Days Driven To Work And/Or School");
		int usedDay = sc.nextInt();
		dailyCharge = usedDay * 5;
		System.out.print("Miles Driven To Work And/Or School");
		int miles = sc.nextInt();
		milesCharge = miles * 1;}
		barePremium=barePremium+milesCharge+dailyCharge;
		System.out.println("How old are you?");
		int age = sc.nextInt();
		int ageChargeRatio =1;
		if (age < 16) {
			System.out.println("Invalid data!");
			System.exit(age);
		} else if (age < 18) {
			ageChargeRatio = 20;
		} else if (age > 17 && age < 22) {
			ageChargeRatio = 6;
		} else if (age > 21 && age < 25) {
			ageChargeRatio = 2;
		} else {
			ageChargeRatio = 1;}
		barePremium=barePremium*ageChargeRatio;
		System.out.println("How many years of driving experience do you have?");
		int drivingExperience = sc.nextInt();
		int experienceDiscount = 0;
		if (age - drivingExperience <= 16 || drivingExperience == 0) {
			System.out.println("Invalid Data!");
			System.exit(drivingExperience);

		} else
			experienceDiscount = drivingExperience * 5;
		barePremium=barePremium-drivingExperience;
		String accident;
		double accidentChargeRatio;
		int accidentCount;
		do {
			System.out.println("Have you had any accidents in the last 5 years" + "Yes / No?");
			accident = scString.nextLine();
		} while (!(accident.equalsIgnoreCase("yes") || accident.equalsIgnoreCase("no")));
		if (accident.equalsIgnoreCase("yes")) {
			System.out.println("How many?");
			accidentCount = sc.nextInt();
			accidentChargeRatio = accidentCount * 0.2 + 1;
		} else {
			accidentChargeRatio = 1;
		}
		barePremium=barePremium*accidentChargeRatio;
		int pastInsuranceChargeRatio;
		String pastInsurance;
		do {
			System.out.println("Have you had continuous insurance for the past 12 months?" + "Yes / No");
			pastInsurance = scString.nextLine();
		} while (!(pastInsurance.equalsIgnoreCase("yes") || pastInsurance.equalsIgnoreCase("no")));
		if (pastInsurance.equalsIgnoreCase("no")) {
			pastInsuranceChargeRatio = 2;
		} else {
			pastInsuranceChargeRatio = 1;
		}
		barePremium=barePremium*pastInsuranceChargeRatio;
		String education;
		double educationChargeRatio;
		do {
			System.out.println("What is the highest level of education you have completed?"
					+ "Doctor / PhD/ Bachelors /Masters /  LHS(Less than High School)");
			education = scString.nextLine();
		} while (!(education.equalsIgnoreCase("Doctor") || education.equalsIgnoreCase("Phd")
				|| education.equalsIgnoreCase("Bachelors") || education.equalsIgnoreCase("Masters")
				|| education.equalsIgnoreCase("LHS")));
		if (education.equalsIgnoreCase("Doctor")) {
			educationChargeRatio = 0.90;
		} else if (education.equalsIgnoreCase("Phd") || education.equalsIgnoreCase("Bachelors")
				|| education.equalsIgnoreCase("Masters")) {
			educationChargeRatio = 0.95;
		} else {
			educationChargeRatio = 1;
		}
		barePremium=barePremium*educationChargeRatio;
		System.out.println(name + ", here's your quote!");
////		calculatedPremium = educationChargeRatio * pastInsuranceChargeRatio * accidentChargeRatio * ageChargeRatio
////				* accidentChargeRatio
//				* (barePremium + ownerCharge + usedTypeCharge + dailyCharge + milesCharge - experienceDiscount);

		System.out.println("Start Your Policy Today For: $" +" "+ barePremium);
		String refNum = ""+name.substring(0,2)+age+name.substring(name.length()-2,name.length())+zip+education.replaceAll(" ", "");
		System.out.println("Referance Number :"+refNum.toUpperCase());
		sc.close();
		scString.close();
	}

}
