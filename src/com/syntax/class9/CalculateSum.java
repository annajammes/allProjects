package com.sytax.class9;

public class CalculateSum {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum = 0;
		System.out.println("the  value in array");
		for (int i = 0; i <= 4; i++) {
			arr[i] = i;
			sum += arr[i];
			System.out.print(" " + arr[i]);

		}

		System.out.print("\n" + "the sum of num is  " + sum);

	}
}
