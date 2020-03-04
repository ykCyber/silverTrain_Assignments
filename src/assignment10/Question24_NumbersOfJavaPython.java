package assignment10;

public class Question24_NumbersOfJavaPython {

	public static void main(String[] args) {
		boolean flag = isEqual("We python study java not pythonjava java python","java","python");
		System.out.println(flag);
	}

	public static boolean isEqual(String string,String str1,String str2) {
		int numJava=(string.length()-string.replace(str1,"").length())/str1.length();
		int numPyhton=(string.length()-string.replace(str2,"").length())/str2.length();
		return numJava==numPyhton;
	}

}
