package telephone;

import java.util.Scanner;

public class GooglePhone extends MobilePhone {
	Scanner sc = new Scanner(System.in);

	String androidVerison;

	public GooglePhone(String androidVerison) {
		super();
		this.androidVerison = androidVerison;
	}

	@Override
	public void call(String name) {
		System.out.println("Do you want to use Google");
		String answer = sc.nextLine();
		if (answer.contains("yes")) {
			System.out.println("Calling " + name + " via facetime");
		} else {
			super.call(name);
		}
	}

	@Override
	public void call(int name) {
		// TODO Auto-generated method stub
		super.call(name);
	}

	public String getAndroidVerison() {
		return androidVerison;
	}

	public void setAndroidVerison(String androidVerison) {
		this.androidVerison = androidVerison;
	}
}