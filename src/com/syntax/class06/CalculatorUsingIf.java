package com.sytax.class06;

import java.util.Scanner;

public class CalculatorUsingIf {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("please first number on which you want to perfom cal"); 
	int a=	in.nextInt();
	System.out.println("please enter operator +,-,*,/");
	char c =in.next().charAt(0);
		System.out.println("please 2nd number on which you want to perfom cal");
		int b=	in.nextInt();
		if(c=='+') {
			System.out.println(a+b);
		}
		else if(c=='-') {
			System.out.println(a-b);
		}else if(c=='*') {
			System.out.println(a*b);
		}else if(c=='/') {
			System.out.println(a/b);
		}
		else {System.out.println("wrong input");}
}
}