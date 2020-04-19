package assignment14.Question08;

public class TestValue {

	public static void main(String[] args) {
		Value.setVal(0);
		System.out.println(Value.wasModified());
		Value value = new Value();
		System.out.println(Value.wasModified());
		System.out.println(value.getVal());
		value.setVal(0);
		System.out.println(Value.wasModified());
		
	}

}
