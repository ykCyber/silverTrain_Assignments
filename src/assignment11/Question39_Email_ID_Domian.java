package assignment11;

public class Question39_Email_ID_Domian {

	public static void main(String[] args) {

		findIdDomian("mike_tyson@cybertek.com");
		findIdDomian("hello-gmail.com");
		findIdDomian("my@fancy@email.com");

	}

	public static void findIdDomian(String email) {
		if(email.split("@").length!=2) {
			System.out.println("invalid e-mail");
		}else {
		System.out.println("Email ID     :"+(email.split("@"))[0]);
		System.out.println("Email Domain :"+(email.split("@"))[1]);
	}}

}
