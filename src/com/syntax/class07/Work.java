package com.sytax.class07;

public class Work {
	public static void main(String [] args) {
		boolean workday=true;
		int day=1;
		while(day<=6 && workday) {
			//if(workday) {
			System.out.println("i need a day off");
			day++;
			//}
		}
		System.out.println("i do not need a day off");
	}

}
