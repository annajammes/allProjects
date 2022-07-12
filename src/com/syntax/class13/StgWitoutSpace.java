package com.sytax.class13;

import java.util.Scanner;

public class StgWitoutSpace {

	public static void main(String[] args) {
		String arr= "i love java pro";
		String[] sen=arr.split(" ");
		
		for(String sen1:sen) {
			System.out.print(sen1);
		}

	}

}
