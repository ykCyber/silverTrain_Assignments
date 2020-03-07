package assignment13;

import java.util.ArrayList;
import java.util.Arrays;

public class Question73_Bob_s_Money {

	public static void main(String[] args) {
		ArrayList<String> moneyAmounth = new ArrayList<>(Arrays.asList("drachma", "11.0", "sek", "5.0"));
		ArrayList<String> currency = new ArrayList<>(Arrays.asList("drachma", "0.6", "sk", "100.0"));
		double converted = convertC(moneyAmounth, currency);
		System.out.println(converted);

	}

	public static double convertC(ArrayList<String> moneyAmounth, ArrayList<String> currency) {
		double total = 0;
		int k = 0;
		for (int i = 1; k < moneyAmounth.size() && i < moneyAmounth.size(); i = i + 2, k = k + 2) {
			if (moneyAmounth.get(k).equalsIgnoreCase(currency.get(k))) {
				total = total + Double.parseDouble(moneyAmounth.get(i)) * Double.parseDouble(currency.get(i));
			} else
				System.err.println("Money and currency doesn't match at line: "+k);
		}
		return total;
	}

}
