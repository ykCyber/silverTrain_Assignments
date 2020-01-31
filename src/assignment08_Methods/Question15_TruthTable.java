package assignment08_Methods;

public class Question15_TruthTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(truthTable(true,true,true));
		System.out.println(truthTable(true,false,true));
		System.out.println(truthTable(false,false,true));
		System.out.println(truthTable(true,true,false));
		System.out.println(truthTable(true,false,true));
	}

	public static boolean truthTable(boolean a,  boolean b, boolean c) {
		return a&&b||c;//if c true result true; if c false a and b both should be to be true;
	}

}
