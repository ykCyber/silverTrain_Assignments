package assignment09;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		laptopPrice();
	}

	private static void laptopPrice() {
		double totalPrice = 0;
		Scanner numbers = new Scanner(System.in);
		Scanner strings = new Scanner(System.in);
		int screenPrice = 0;
		do {
			System.out.println("Select Screen Size");
			System.out.println("13,3 / 15,0 / 17,3");
			double size = numbers.nextDouble();
			screenPrice = size == 13.3 ? 200 : size == 15.0 ? 300 : size == 17.3 ? 400 : 0;
		} while (screenPrice == 0);
		int cPuPrice = 0;
		do {
			System.out.println("Select CPU");
			System.out.println("i3 / i5 / i7");
			String CPU = strings.nextLine();
			cPuPrice = CPU.equalsIgnoreCase("i3") ? 150
					: CPU.equalsIgnoreCase("i5") ? 250 : CPU.equalsIgnoreCase("i7") ? 350 : 0;
		} while (cPuPrice == 0);
		int ramPrice;
		int ram;
		do {
			System.out.println("Enter RAM size");
			System.out.println("4 / 8 / 12 / 16../../");
			ram = numbers.nextInt();
			ramPrice = 50 * ram / 4;
		} while (ram % 4 != 0);
		String storageType;
		int storageCapacity;
		int sddHddPrice;
		int storagePrice;
		do {
			System.out.println("Enter storage type");
			System.out.println("SSD / HDD");
			storageType = strings.nextLine();
		} while (!(storageType.equalsIgnoreCase("ssd") ^ storageType.equalsIgnoreCase("hdd")));

		sddHddPrice = storageType.equalsIgnoreCase("ssd") ? 100 : storageType.equalsIgnoreCase("hdd") ? 50 : 0;
		do {
			System.out.println("Enter storage capacity");
			System.out.println("500 / 1000 / 1500 ../..");
			storageCapacity = numbers.nextInt();
		} while (storageCapacity % 500 != 0);
		storagePrice = storageCapacity / 500 * sddHddPrice;
		int screenSolutionPrice = 0;
		do {
			System.out.println("Enter screen resolution");
			System.out.println("FullHD / 4K");
			String resoltion = strings.nextLine();
			screenSolutionPrice = resoltion.equalsIgnoreCase("fullhd") ? 100
					: resoltion.equalsIgnoreCase("4k") ? 200 : 0;
		} while (screenSolutionPrice == 0);
		totalPrice = screenPrice + ramPrice + storagePrice + cPuPrice + screenSolutionPrice;
		System.out.printf("Laptop Price is :%d$", totalPrice);
	}
}
