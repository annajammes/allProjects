package com.sytax.class10;

import java.util.Arrays;

public class TwoDArrays {
	public static void main(String[] args) {
		String Mr;
		String[][] arr = { { "Mr", "Mrs", "Ms", "Miss" },

				{ "Smith", " Jordan", "Jackson", "Obama" } };
		for (int i = 0; i <= 1; i++) {

			for (int j = 0; j <= 3; j++)
				if (j == 0) {
					System.out.println(arr[i][j] + " ");
					break;}
				}
		for (int i = 0; i <= 1; i++) {

			for (int j = 0; j <= 3; j++)
				if(j==1) {
					System.out.println(arr[i][j] + " ");
					break;}
				}
		for (int i = 0; i <= 1; i++) {

			for (int j = 0; j <= 3; j++)
				 if(j==2) {
					System.out.println(arr[i][j] + " ");
					break;
				}
			
			
		}
	}
}
