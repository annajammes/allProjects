package com.sytax.class06;

import java.util.Scanner;

public class Claculator {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("please first number on which you want to perfom cal"); 
	int a=	in.nextInt();
	System.out.println("please enter operator +,-,*,/");
	char c =in.next().charAt(0);
		System.out.println("please 2nd number on which you want to perfom cal");
		int b=	in.nextInt();
		switch(c) {
		case '+' :
		System.out.println(a+b);
		break;
		case '-' :
			System.out.println(a-b);
			break;
		case '*' :
			System.out.println(a*b);
			break;
		case '/' :
			System.out.println(a/b);
			break;
		default:
			System.out.println("wrong input");
	}

}
}
