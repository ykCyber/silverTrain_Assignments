package telephone;

import java.util.Scanner;

public class iPhone extends MobilePhone {
	String OS;
	Scanner sc = new Scanner(System.in);

	@Override
	public void call(String name) {
		System.out.println("Do you want to use FaceTime");
		String faceTime = sc.nextLine();
		if (faceTime.contains("yes")) {
			System.out.println("Calling " + name + " via facetime");
		} else {
			super.call(name);
		}
	}

	@Override
	public void call(int number) {
		// TODO Auto-generated method stub
		super.call(number);
	}

	public iPhone(String oS) {

		OS = oS;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}
}