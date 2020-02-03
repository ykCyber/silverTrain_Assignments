package lab3Cont;

public class Question16atFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		;
		System.out.println(atFirst("q"));
	}

	public static String atFirst(String str) {
		StringBuilder sb = new StringBuilder("");
		if (str.length() >= 2) {
			sb.append(str.substring(0, 2));
			return sb.toString();
		} else {
			str=str.concat("@");
			sb.append(str.charAt(0)).append("@");

			return sb.toString();
		}
	}
}
