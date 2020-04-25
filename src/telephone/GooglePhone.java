package telephone;

import java.util.Scanner;

public class GooglePhone extends Smartphone {

	

	public GooglePhone(String OS) {
		super();
		this.OS = OS;
	}

	@Override
	public void call(String name) {
		System.out.println("Do you want to use Google DOU ");
		String answer = sc.nextLine();
		if (answer.contains("yes")) {
			duoCall(name);

		} else {
			super.call(name);
		}
	}

	public void duoCall(String name) {
		System.out.println("Calling " + name + " via GOOGLE DUO");

	}

	public String getOS() {
		return OS;
	}

	public void setAndroidVersion(String OS) {
		this.OS = OS;
	}

	Scanner sc = new Scanner(System.in);

}