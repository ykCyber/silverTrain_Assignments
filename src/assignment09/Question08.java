package assignment09;

public class Question08 {

	public static void main(String[] args) {
		readOrNotRead("subject: important project, AleJandro we refer to you this ..");
		readOrNotRead("subject: important project,  we refer to you this ..");
	}

	public static void readOrNotRead(String string) {
		if(string.toLowerCase().contains("alejandro".toLowerCase())) {
			System.out.println("read this mail");
		}else System.out.println("don't read");
	}

}
