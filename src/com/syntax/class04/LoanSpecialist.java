package com.sytax.class04;

import java.util.Scanner;

public class LoanSpecialist {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("kindly tell what is the amount of loan needed?");
		int loan = input.nextInt();
		if(loan<=200000) {
			System.out.println("your loan is granted. ");
			
		}else {
			System.out.println("you cannot get a loan.");
		}

		

	}

}
