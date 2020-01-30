package assignment08_Methods;

public class Question12_Profits {

	public static void main(String[] args) {
		System.out.println(calProfits(100, 20));

	}

	public static String calProfits(int sellPrice, int buyPrice) {
	
		if (sellPrice == buyPrice)
			return "No Loss";
		if (buyPrice > sellPrice)
			return "Loss";
		else
			return "Profit";

	}

}
