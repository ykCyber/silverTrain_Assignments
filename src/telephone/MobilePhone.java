package telephone;

public class MobilePhone {
	String serviceProvider;
	String phoneType;
	int batteryCapacity;

	public static void music() {
		System.out.println("Playing on RADIO ");
	}

	public void call(String name) {
		System.out.println("Calling  " + name + " via celular provider");
	}

	public void call(int number) {
		System.out.println("Calling +" + number + " via celular provider");

	}
}
