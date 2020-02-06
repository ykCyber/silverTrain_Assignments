package lab3Cont;



public class Question11numberOfStringInString {

	public static void main(String[] args) {
		String str = "Hello I am learning java. @Cybertek. I am gonna be a super SDET"
				+ "Cybertek is a great opportie for us to change our life."
				+ "My mentor Etnik helps me every time."
				+ "Hi Etnik How are you?; ";
		
		String searchWorld="Etnik";
		countXX(str, searchWorld);
	}

	public static void countXX(String str, String searchWorld) {
		int count = 0;
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i <= (searchWorld.length()+2); i++) {
			sb.append(str).append(" ");
		}

		for (int i = 0; i < str.length(); i++) {
			if (sb.substring(i, i + searchWorld.length()).equalsIgnoreCase(searchWorld)) {
				count++;
				i++;
			}
		}
		switch (count) {
		case 1: {

			System.out.printf("There is %d \"%s\" string in \"%s\".", count, searchWorld, str);
			break;
		}
		default:
			System.out.printf("There are %d \"%s\" string in \"%s\".", count, searchWorld, str);
		}

	}
}
