package assignment11;

public class Question46_WriteShorts {

	public static void main(String[] args) {
		String given = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
		writeShortest(given);
	}

	public static void writeShortest(String given) {
		
		int min = Integer.MAX_VALUE;
		String arr []= given.split(", ");
		for (int i = 0; i < arr.length; i++) {
			min = Integer.min(arr[i].length(), min);
		}
		for (int i = 0; i < arr.length; i++) {
			if (min == arr[i].length()) {
				System.out.println(arr[i]);
				
			}
		}
	}

}
