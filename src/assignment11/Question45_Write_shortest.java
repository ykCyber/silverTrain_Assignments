package assignment11;

public class Question45_Write_shortest {

	public static void main(String[] args) {
		String arr[] = { "aa321321321321313a", "bb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa" };
		shortest(arr);
	}

	public static void shortest(String[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			min = Integer.min(arr[i].length(), min);
		}
		for (int i = 0; i < arr.length; i++) {
			if (min == arr[i].length()) {
				System.out.println(arr[i]);
				break;
			}
		}
	}
}
