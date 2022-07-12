package com.sytax.class01;

import java.util.Scanner;

public class PhoneWith {

	public static void main(String[] args) {
		
		    Scanner in=new Scanner(System.in);
		  System.out.println("Enter your name");
		String name=in.next();
		  
		     System.out.println("Enter your age");
		int age=in.nextInt();
		     System.out.println("Enter your mobile number");
		String mobile=in.next();

		    System.out.println(" your name is "+name+"  your age is "+age+" and your mobile number is ");
		   System.out.println(mobile.replaceFirst("(\\d{3})(\\d{3})(\\d{3})", "$1 -$2-$3"));

	}

}
