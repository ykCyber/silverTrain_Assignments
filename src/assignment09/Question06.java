package assignment09;

public class Question06 {

	public static void main(String[] args) {
		
		reverse("12346");
		
	}

	public static void reverse(String string) {
		if(string.length()>5)System.out.println("Too long");
		if(string.length()<5)System.out.println("Too short");
		else {
			StringBuffer sb = new StringBuffer(string);
			string= ""+sb.reverse();
		}
		System.out.println(string);
	}

}
