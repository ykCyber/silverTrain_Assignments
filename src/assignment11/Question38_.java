package assignment11;

public class Question38_ {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 8, 7 ,6};
		int numbersOfEven = countEven(arr);
		System.out.println(numbersOfEven);
	}

	public	static int countEven(int[] arr) {
		int counter=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0)counter++;
		}
		return counter;
	}

}
