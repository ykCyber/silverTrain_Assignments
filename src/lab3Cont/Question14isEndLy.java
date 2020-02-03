package lab3Cont;

public class Question14isEndLy {

	public static void main(String[] args) {
		
		System.out.println(endsLy("oddly"));
		System.out.println(endsLy("y"));
		System.out.println(endsLy("oddy"));
		System.out.println(endsLy("italy"));
	}

	public static boolean endsLy(String str) {
		if (str.length()<2) return false;
		return 
		str.substring(str.length()-2).contentEquals("ly");
	}

}
