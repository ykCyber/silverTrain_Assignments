package lab3Cont;

public class Question15HasBad {

	public static void main(String[] args) {

		System.out.println(hasBad(""));
		System.out.println(hasBad("xxbadx"));
		System.out.println(hasBad("xbadxx"));
		System.out.println(hasBad("bad"));

	}

	public static boolean hasBad(String str) {
		if (str.length() <= 3)
			return str.contentEquals("bad");
		return str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad");
	}

}
