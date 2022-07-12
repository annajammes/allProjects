package com.sytax.class10;

public class GradsArray {

	public static void main(String[] args) {

		String[][] arr = {

				{ "Smith", " Jordan", "Jackson", "Obama" }, { "A", "B", "C", "D" } };
		for (int i = 0; i <= 1; i++) {

			for (int j = 0; j <= 3; j++)
				if (j == 0) {
					System.out.println(arr[i][j] + " ");
					break;
				}
		}
		for (int i = 0; i <= 1; i++) {

			for (int j = 0; j <= 3; j++)
				if (j == 1) {
					System.out.println(arr[i][j] + " ");
					break;
				}
		}

	}

}
