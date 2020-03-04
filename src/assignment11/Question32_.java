package assignment11;

public class Question32_ {

	public static void main(String[] args) {
		writeFirstTree();
		// TODO Auto-generated method stub
		writeFirstTree("apple", "banana", "abcd", "a");
	}

	public static void writeFirstTree(String... strings) {
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].length() >= 2) {
				System.out.println(strings[i].substring(0, 3));
			}
		}

	}

}
