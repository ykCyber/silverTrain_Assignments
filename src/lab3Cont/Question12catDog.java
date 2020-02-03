package lab3Cont;

public class Question12catDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "catDogcatDogcatDogcatDogcatDogcatDogcatDogcatDogcat";
		catDog(str);

	}

	public static void catDog(String str) {
		int numberOfCats = 0;
		int numberOfDogs = 0;
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i <= 4; i++) {
			sb.append(str).append(" ");
		}

		for (int i = 0; i < str.length(); i++) {
			if (sb.substring(i, i + 3).equalsIgnoreCase("dog")) {
				numberOfDogs++;
				i++;
			}
			if (sb.substring(i, i + 3).equalsIgnoreCase("cat")) {
				numberOfCats++;
				i++;
			}
		}
		if (numberOfCats == numberOfDogs) {
			System.out.printf("There are %1d cat and %1d dog string in this \"%s\" string.\n"
					+ "They are equal.", numberOfCats,numberOfDogs,str);
		} else {
			System.out.printf("Number of cat:%3d\nNumber of dog:%3d\nThey are not equal."
					,numberOfCats,numberOfDogs);
		}
	}

}
