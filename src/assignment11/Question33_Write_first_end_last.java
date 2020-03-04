package assignment11;

public class Question33_Write_first_end_last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeFirstLastChar("apple", "banana", "abcd", "a");
	}

	public static void writeFirstLastChar(String... strings) {
		for (int i = 0; i < strings.length; i++) {	
			System.out.println(strings[i].substring(0,1) + strings[i].charAt(strings[i].length() - 1));
		}
	}
}
