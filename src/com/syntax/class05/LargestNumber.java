package com.sytax.class05;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter please 1st  distinct decimal number");
		double num1 = in.nextDouble();
		System.out.println("enter please 2nd  distinct decimal number");
		double num2 = in.nextDouble();
		System.out.println("enter please 3rd  distinct decimal number");
		double num3 = in.nextDouble();
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" "+" is greater");
	}

		else if(num2>num1 && num2>num3) {
			System.out.println(num2 +" "+"is greater");
	}
		else if(num3>num2 && num3>num1) {
			System.out.println(num3 +" "+"is greater");
	}
}
}