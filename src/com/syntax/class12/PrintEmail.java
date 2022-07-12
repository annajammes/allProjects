package com.sytax.class12;

import java.util.Scanner;

public class PrintEmail {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter your First name");

		String firstn = in.next();
		System.out.println("enter your last name");

		String lastn = in.next();
		System.out.println("enter your eamil address");

		String email = in.next();

		GradeMethod getemail = new GradeMethod();
		
		String fulladdres=getemail.printEmail(firstn,lastn, email);
		System.out.println(fulladdres);

	}

}
