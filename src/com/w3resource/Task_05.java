package com.w3resource;

import java.util.Arrays;

public class Task_05 {

	public static void main(String[] args) {
//		 Write a Java program to test if an array contains a specific value.
		int [] arr = {1,5,8,10};
		boolean flag = contain(arr,11);
		System.out.println(flag);
	}

	private static boolean contain(int[] arr, int i) {
		return Arrays.binarySearch(arr, i)>=0;
	}

}
