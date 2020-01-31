package assignment08_Methods;



public class Question06_next3 {

	public static void main(String[] args) {
		next3(20);
	}

	public static void next3(int num) {
		for (int i = 0; i < 3; i++) {
			System.out.print((++num)+" ");
		}
		
	}

}
