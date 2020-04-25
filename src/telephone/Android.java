package telephone;

import java.util.Scanner;

public class Android extends Smartphone {

	String androidVersion = this.OS;
	String brand;

	public Android(String Brand,String OS) {
		super();
		System.out.println(" You can achieve GooglePhone Class  ");
		this.brand= brand;
		this.OS = OS;
	}
	public void googleStore(){
		System.out.println("You can use Google Store");
	}
	public static void music() {
		System.out.println("Playing on GOOGle MUSIC Player");}
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