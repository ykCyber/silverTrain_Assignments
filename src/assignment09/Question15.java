package assignment09;

public class Question15 {

	public static void main(String[] args) {
		String str= ("catcatDogcatdogDog");
		boolean flag = isCatDogNumberSame(str);
		System.out.println(str+"\n"+flag);
		System.out.println(isCatDogNumberSame("dogCat"));
	}

	private static boolean isCatDogNumberSame(String str) {
		str =str.toLowerCase();
		int numbersOfCat;
		int numbersOfDog;
		numbersOfCat = (str.length()-str.replaceAll("cat","").length())/3;
		numbersOfDog = (str.length()-str.replaceAll("dog","").length())/3;
		return numbersOfCat==numbersOfDog;
	}

}
