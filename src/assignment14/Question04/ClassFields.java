package assignment14.Question04;

import java.lang.reflect.Field;

public class ClassFields {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field[] fieldsOfperson = Person.class.getFields();
		String fieldName = fieldsOfperson[0].getName().toString();
		int result = (int) Person.class.getField(fieldName).get(null);
		System.out.println(result);
		fieldName = fieldsOfperson[1].getName().toString();

		System.out.println(fieldName);
		String alfa = null;
		System.out.println(Person.class.getField(fieldName).get(alfa));
	}

}
