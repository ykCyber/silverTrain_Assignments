package assignment14.Question13;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Person {
	public static int[] white = new int[] { 255, 255, 255 };
	public static int[] black = new int[] { 0, 0, 0 };
	public static int[] yellow = new int[] { 55, 55, 55 };
	public static int[] orange = new int[] { 25, 25, 25 };
	private  int[] rgb = new int[3];

	Person(int r, int g, int b) {
		this.rgb[0] = r;
		rgb[1] = r;
		rgb[2] = r;
	}

	public Person() {
		this(255, 255, 255);
	}

	public Person(int... args) {

	}

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.toString());
		Person p2 = new Person(55, 55, 55);
		System.out.println(p2.toString());
		Person p3 = new Person(25, 25, 25);
		System.out.println(p3.toString());
		Person p4 = new Person(125, 215, 251);
		System.out.println(p4.toString());
		System.out.println(p1.toString());
	}

	@Override
	public String toString() {
		Field[] allFields = Person.class.getFields();
		String color = "n/a";
		boolean flag = false;
		for (Field field : allFields) {
			String givenColor = field.getName();
			int[] result = null;
			try {
				result = (int[]) Person.class.getField(givenColor).get(result);
				flag = Arrays.equals(this.rgb, result);
			} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
				e.printStackTrace();
			}
			if (flag) {
				color = givenColor;
				break;
			}
		}
		return color;
	}

}
