package assignment09;

public class Question13 {

	public static void main(String[] args) {
		navigation('C', 'A');

	}

	private static void navigation(char start, char finish) {
		String result = "";
		while (start != finish)

		{
			switch (start) {
			case 'A': {
				result = result + "Right>";
				start = 'B';
				break;
			}
			case 'B': {
				result = result + "Down>";
				start = 'C';
				break;
			}
			case 'C': {
				result = result + "Left>";
				start = 'D';
				break;
			}
			case 'D': {
				result = result + "Up>";
				start = 'A';
				break;
			}
			}
		}
		System.out.print(result + finish + " found");
	}
}
