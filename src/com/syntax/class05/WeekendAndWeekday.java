package com.sytax.class05;

import java.util.Scanner;

public class WeekendAndWeekday {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter the day");
		String dayno = in.next();
		if (dayno.equals("monday") ||dayno.equals("tuesday")
				||dayno.equals("wednesday") ||dayno.equals("thursday") 
				|| dayno.equals("friday") )
		{
			
			System.out.println("its a weekday");

		}
		else	if (dayno.equals("saturday") ||dayno.equals("sunday") )
		{
			
			System.out.println("its a weekend");

		}else {
			System.out.println("invalid input");
		}
		

		}

	}


