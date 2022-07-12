package com.sytax.class8;

import java.util.Scanner;

public class ApplyCard {


	
	public static void main(String[] args) {
		String card="yes";
		
		for(int i=0;i<=9;i++) {
			System.out.println("apply for the credit card ");
			Scanner scan=new Scanner(System.in);
			String status=scan.next();

if(card.equalsIgnoreCase(status)) {
	break;
}
	
}

	}

}

