package assignment13;

import java.util.ArrayList;
import java.util.Arrays;

public class Question72_ {

	public static void main(String[] args) {
		ArrayList<Integer>arr = new ArrayList<>(Arrays.asList(100,200,10)); 
		refuel_times(arr, 10);
	}

	private static int refuel_times(ArrayList<Integer> arr, int capacity) {
		int refuel = 0;
		for (int j = 0; j < arr.size(); j++) {
			int fuelUnit = arr.get(j);

			if (fuelUnit <= capacity) {
				refuel++;
			} else if (fuelUnit % capacity == 0) {
				refuel = refuel + fuelUnit / capacity;
			} else {
				refuel = refuel + fuelUnit / capacity + 1;
			}
		}
		System.out.println(refuel);
		return refuel;
	}

}
