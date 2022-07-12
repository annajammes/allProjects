package com.sytax.class04;

import java.util.Scanner;

public class SalaryBonus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter number of worked years");
		int years = in.nextInt();
		System.out.println("enter annual salary");
		int sal = in.nextInt();
		if (years >= 5) {
			System.out.println("eligible for bonus");
			if (sal >= 50000) {
				System.out.println("your bonus amount is 5000");
			} else {
				System.out.println("your bonus is 3000");
			}

		} else {
			System.out.println("your are not eligibel for bonus");
		}

	}

}
