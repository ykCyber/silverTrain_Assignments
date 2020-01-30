package assignment_6_ForLoop;

public class Question03_Divided_5 {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i += 5) {
			if (i == 0)
				continue;
			System.out.println(i);
		}
	}

}
