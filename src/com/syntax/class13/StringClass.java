package com.sytax.class13;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr= "1234edfr*1~-=l,";
		System.out.print(arr.replaceAll("[^a-z0-9A-Z]","").length());
		
	
	}

}
