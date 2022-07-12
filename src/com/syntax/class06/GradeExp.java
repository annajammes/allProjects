package com.sytax.class06;

import java.util.Scanner;

public class GradeExp {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("please enter your grade");
	char c =in.next().charAt(0);
	
		switch(c) {
		case 'a' :
		System.out.println(c+" excellent");
		break;
		case 'b' :
			System.out.println(c+" good");
			break;
		
		default:
			System.out.println("wrong input");
	}

}

	}


