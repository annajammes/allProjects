package com.sytax.class04;

public class DiplomaHolder {

	public static void main(String[] args) {
		boolean diploma = false;
		double gpa = 2.2;
		if (diploma == true) {
			System.out.println("congratulation ");
		} else if (diploma == false) {
			System.out.println("you should get a degree");
			if (gpa >= 3.5) {
				System.out.println("you are eligible for a schloarship");
			} else {
				System.out.println("you shoulde work hard");
			}

		}

	}

}
