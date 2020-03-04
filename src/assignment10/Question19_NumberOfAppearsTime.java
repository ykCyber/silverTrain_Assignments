package assignment10;

public class Question19_NumberOfAppearsTime {

	public static void main(String[] args) {
		int num = numberOfJava("javajavajava");
		System.out.println(num);
	}

	public static int numberOfJava(String string) {
		int num;
		num=(string.length()-string.replace("java","").length())/4;
		return num;
	}

}
