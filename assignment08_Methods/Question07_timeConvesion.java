package assignment08_Methods;

import java.util.Scanner;

public class Question07_timeConvesion {
	public static void main(String[] args) {
		timeConversion("02:20:00pm");
		timeConversion();
	}

	public static void timeConversion() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter time data as shown to convert Military (24-hour) time.");
		System.out.println("Valid for is HH:MM:SS(AM/PM)");
		String time = sc.nextLine();
		int hour = 0;
		try {

			time.indexOf(':');// this value will be used to find HOUR data;
			hour = Integer.parseInt((String) time.subSequence(0, time.indexOf(':')));// we get hour value
		} catch (Exception e) {
			System.out.println("INVALID INPUT!!!");
		}
		if (time.length() != 10 | hour > 12 | hour < 1) {// there must be 10 char and hour should be less than 13and
															// larger than 0 at valid time.
			System.out.println("Invalid Input");
			System.out.println("TRUE FORMAT is  HH:MM:SS:(AM/PM)");
		} else {
			String amORpm = time.substring(time.length() - 2);// we find it is AM or Pm;
			String newTime = (String) time.subSequence(0, 8);// we cut am/pm part;
			if (amORpm.equalsIgnoreCase("am") && hour == 12) {// if it is 12AM
				hour = (hour + 12) % 24;
				newTime = "00:" + newTime.substring(3);// 12:00:00AM is 00:00:00
			} else if (amORpm.equalsIgnoreCase("am") && hour != 12) {// if it is AM and Hour<12
				newTime="(time.subSequence(0, 8)";/* this will remove last two char */ 
			} else if (amORpm.equalsIgnoreCase("pm") && hour <= 12) {
				newTime=hour==12?"12:"+newTime.substring(3):(hour +12)+ ":" + newTime.substring(3);
			}
			System.out.println(newTime);
			sc.close();
		}
	}

	public static void timeConversion(String time) {
		time.indexOf(':');// this value will be used to find HOUR data;
		int hour = Integer.parseInt((String) time.subSequence(0, time.indexOf(':')));// we get hour value
		if (time.length() != 10 | hour > 12 | hour < 1) {// there must be 10 char and hour should be less than 13and
															// larger than 0 at valid time.
			System.out.println("Invalid Input");
			System.out.println("TRUE FORMAT is  HH:MM:SS:(AM/PM)");
		} else {
			String amORpm = time.substring(time.length() - 2);// we find it is AM or Pm;
			String newTime = (String) time.subSequence(0, 8);// we cut am/pm part;
			if (amORpm.equalsIgnoreCase("am") && hour == 12) {// if it is 12AM
				hour = (hour + 12) % 24;
				newTime = "00:" + newTime.substring(3);// 12:00:00AM is 00:00:00
			} else if (amORpm.equalsIgnoreCase("am") && hour != 12) {// if it is AM and Hour<12
				newTime="(time.subSequence(0, 8)";/* this will remove last two char */ 
			} else if (amORpm.equalsIgnoreCase("pm") && hour <= 12) {
				newTime=hour==12?"12:"+newTime.substring(3):(hour +12)+ ":" + newTime.substring(3);
			}
			System.out.println(newTime);
		}
	}
}
