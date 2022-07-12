package com.sytax.class12;

import java.util.Scanner;

public class GetGrade {

	public static void main(String[] args) {
		System.out.println("enter your grade");
		Scanner in =new Scanner(System.in);
	int score=	in.nextInt();
	
		GradeMethod get =new GradeMethod();
	
		System.out.println(get.getGrade( score));

	}

}

