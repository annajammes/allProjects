package com.sytax.class07;

import java.util.Scanner;

public class PurchaseClass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int price = 10;
		int payment=0;
		do {
			System.out.println("pay for you item");
			 payment = in.nextInt();
			 if (payment < price) {
				 int rem=price-payment;
				 System.out.println("you need to pay furterer "+rem);}
				 
				 if (payment > price) {
					 int ext=payment-price;
					 System.out.println("you change is "+ext);
					 break;
					 
				 
			 }

		} while (payment < price || payment > price);
		System.out.println("you made the payment");
	}
}


