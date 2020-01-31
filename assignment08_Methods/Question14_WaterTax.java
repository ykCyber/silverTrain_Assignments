package assignment08_Methods;

public class Question14_WaterTax {

	public static void main(String[] args) {
		System.out.println(waterTax(50d));
		System.out.println(waterTax(55d));
		System.out.println(waterTax(101d));
		System.out.println(waterTax(151d));
		System.out.println(waterTax(50f));
		System.out.println(waterTax(55f));
		System.out.println(waterTax(101f));
		System.out.println(waterTax(151f));
	}

	public static double waterTax(double waterUsed) {
		double tax = 0;
		tax = waterUsed <= 50 ? (waterUsed * 0.60)
				: waterUsed > 50 && waterUsed <= 100 ? ((waterUsed * 0.90))
						: waterUsed > 100 && waterUsed <= 150 ? (50 + (waterUsed * 0.90)) : (100 + (waterUsed * 0.90));
		return tax;
	}

	public static double waterTax(float waterUsed) {
		double tax;
		double fine, ratio;
		if (waterUsed <= 50) {
			ratio = 0.6;
			fine = 0;
		} else if (waterUsed > 50 && waterUsed <= 100) {
			ratio = 0.9;
			fine = 0;
		} else if (waterUsed > 100 && waterUsed <= 150) {
			ratio = 0.9;
			fine = 50;
		} else {
			ratio = 0.9;
			fine = 100;

		}
		tax = waterUsed * ratio + fine;
		return tax;
	}

}
