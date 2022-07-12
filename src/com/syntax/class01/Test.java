package com.sytax.class01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		 
		System.out.println("thristy?");
		Scanner in=new Scanner(System.in);
		    String ar=in.next();
		System.out.println("sleepy?");
		    Scanner inp=new Scanner(System.in);
		String sr=inp.next();
		if(ar.equals("yes")&&sr.equals("yes"))
		{
		  System.out.println("coofee");
		}
		else if(ar.equals("yes")&&sr.equals("no"))
		{
		  System.out.println("water");
		}
	}

}
