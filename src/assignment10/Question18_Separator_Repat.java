package assignment10;

public class Question18_Separator_Repat {

	public static void main(String[] args) {
		
		String input = "x";
		int repeatNum = 3;
		seperateRepeate("Word",input,repeatNum);
	}

	public static void seperateRepeate(String string, String input, int repeatNum) {
		System.out.println(string.concat(input).repeat(repeatNum-1).concat(string));
	}

}
