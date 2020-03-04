package assignment11;

public class Question40_writeLongest {

	public static void main(String[] args) {
		String arr[] = { "aa321321321321313a", "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa" };
		largest(arr);
	}

	public static void largest(String[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			max = Integer.max(arr[i].length(), max);
		}
		for (int i = 0; i < arr.length; i++) {
			if (max == arr[i].length()) {
				System.out.println(arr[i]);
				break;
			}
		}
	}
}
