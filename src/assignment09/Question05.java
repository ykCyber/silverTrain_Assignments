package assignment09;

public class Question05 {

	public static void main(String[] args) {
		merge("ld","5tp");
	}

	public static void merge(String string, String string2) {
		String merged="";
		if(string.length()!=3||string2.length()!=3) {
			System.out.println("Can not merge.");
		}
		else {
			for (int i = 0; i < string.length(); i++) {
				merged = merged+string.charAt(i)+string2.charAt(i);
			}
			System.out.println(merged);
		}
	}

}
