package lab3Cont;

public class isPalin {

	public static void main(String[] args) {
		isWordPalin("top spot racecar top sp ot");

	}

	public static void isWordPalin(String string) {
		StringBuffer sb =  new StringBuffer(string.replace(" ", ""));
		StringBuilder sf = new StringBuilder(string.replace(" ", ""));
		System.out.println(" String buffer  " +sb.toString().equalsIgnoreCase(sb.reverse().toString()));
		System.out.println(" String Bulder  "+sf.toString().equalsIgnoreCase(sf.reverse().toString()));
		String	dummy1=string.replace(" ", "");
		String dummy="";
		for (int i = dummy1.length(); i >0 ; i--) {
			dummy = dummy+dummy1.charAt(i-1);
			
		}
		System.out.println();
		System.out.println(string);
		System.out.println(dummy.equalsIgnoreCase(dummy1));
	}

}
