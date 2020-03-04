package assignment10;

import java.util.Arrays;

public class Question22_HTML_ID {

	public static void main(String[] args) {
		String str ="<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";
		System.out.println(htmlTag(str));
	}

	public static String htmlTag(String str) {
		String tag ="invalid data";
		if(str.contains("html")) {
		 String [] arr = str.split("\"");
		 tag = arr[1];
		}
		return tag;
	}

}
