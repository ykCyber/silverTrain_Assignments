package assignment11;

public class Question35_Reverse_AssignToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeReverse("Hello java how are you");
	}

	public static void writeReverse(String string) {
		Object[] alfa = string.split(" ");
		string = "";
		for (int i = alfa.length - 1; i >= 0; i--) {
			string = string + alfa[i]+" ";
		}
		System.out.println(string);
	}
}
