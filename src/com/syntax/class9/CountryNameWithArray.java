package com.sytax.class9;

import java.util.Scanner;

public class CountryNameWithArray {

	public static void main(String[] args) {
		String[] country = new String[3];
		country[0] = "pak";
		country[1] = "ini";
		country[2] = "aus";

		Scanner scan = new Scanner(System.in);
		String[] arr = new String[3];

		System.out.println("plese enter the name of country");
		for (int i = 0; i <= 2; i++) {
			String name = scan.next();
			arr[i] = name;
		 System.out.println(arr[i]);
		}
		for (int j = 0; j <= 2; j++) {
			if (arr[j] == country[j]) {
				System.out.println(" isl");
			}
		}
		for (int k = 0; k <= 2; k++) {
			if (arr[k] == "ini") {
				System.out.println(" mubi");
			}

		}
		for (int l = 0; l <= 2; l++) {
			if (arr[l] == "aus") {
				System.out.println(" london");
			}

		}

	}
}
