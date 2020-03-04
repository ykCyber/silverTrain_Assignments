package assignment12;

public class Question52_Matches {

	public static void main(String[] args) {
		int arr[][] = { { 1, 0, 0, 8, 2, 5 }, 
						{ 1, 5, 3, 3, 4, 5 }, 
						{ 1, 2, 3, 8, 4, 5 }, 
						{ 5, 2, 3, 8, 4, 5 },
						{ 5, 2, 3, 3, 4, 5 } };
		int result=0;
		for (int i = 0; i < arr[0].length; i++) {
			int counter = 0;
			for (int j = 1;j<arr.length;  j++) {
			if(	arr[0][i]==arr[j][i])
				{counter++;}
			else {j++;
			}
			}
			if(counter+1==arr.length)
				result++;
		}
		{
		}
		System.out.println(result);
	}
}
