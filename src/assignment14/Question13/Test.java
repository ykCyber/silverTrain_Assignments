package assignment14.Question13;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Color c1 = new Color();
		Color c2 = new Color(255,0,255);
		Color c3 = new Color(00,00,0);
		System.out.println(c1.toString());
		System.out.println(c3.toString());
		System.out.println(c2.toString());

	}
}
