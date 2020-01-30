package assignment_6_ForLoop;

public class Question01_TableOf12 {

	public static void main(String[] args) {
		int constant = 12;
		for (int i = 0; i < 10; i++) {
			System.out.println(constant + "X" + (i + 1) + "=" + ((i + 1) * constant));
		}
	}

}
