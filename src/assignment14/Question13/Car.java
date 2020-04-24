package assignment14.Question13;

import java.lang.reflect.Field;

public class Car {

	public String[] modelNames = new String[20];
	public static String brand = "Honda";
	static int engine = 3000;
	public int gear = 6;

	public static void main(String[] args) {
		Field[] areas = Color.class.getDeclaredFields();

		for (Field field : areas) {
			System.out.println(field.getName());
		}
			
	}
}
