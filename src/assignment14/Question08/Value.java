package assignment14.Question08;

public class Value {
	private static int val = 0;
	private static boolean flag = false;

	public Value() {

	}

	public Value(int val) {
		Value.val = val;
	}

	public static int getVal() {
		return val;
	}

	public static void setVal(int val) {
		Value.flag = true;
		Value.val = val;
	}

	public static boolean wasModified() {
		return flag;

	}
}
