package assignment11;

public class Question36_isNextSame {

	public static void main(String[] args) {
		int arr[] =  {1, 4, 4, 1, 99} ;
		
		boolean flag = isNextSame(arr, 5);
		System.out.println(flag);
	}

	private static boolean isNextSame(int[] arr, int i) {
		boolean flag = false;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == i && arr[j] == arr[j + 1]) {
				flag = true;break;}
		}
		return flag;
	}
}
