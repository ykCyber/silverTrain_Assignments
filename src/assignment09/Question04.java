package assignment09;

public class Question04 {

	public static void main(String[] args) {
		middleThree("y_USU_f");
	}

	public static void middleThree(String string) {
		if(string.length()%2==1&&string.length()>4) {
			System.out.println(string.substring(string.length()/2-1,string.length()/2+2));
		}
		else System.out.println("invalid");
	}

}
