package assignment08_Methods;

public class Question03_hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello();
	}

	public static void world() {
		System.out.println("World!");
	}

	public static void hello() {
		System.out.print("Hello ");
		world();
	}
}
