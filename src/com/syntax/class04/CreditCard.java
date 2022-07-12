package com.sytax.class04;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("do you have a credit card");
		String status = in.next();
		if (status.equals("yes")) {
			System.out.println("what is the balance on the card");
			int bal = in.nextInt();
			if (bal > 1000) {
				System.out.println("you can purchase");
			} else {
				System.out.println("you can spend more");
			}
		}
		if (status.equals("no")) {
			System.out.println("you must have a credit card");

		}

	}

}
