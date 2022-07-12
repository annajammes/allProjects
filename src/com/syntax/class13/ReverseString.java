package com.sytax.class13;

public class ReverseString {

	public static void main(String[] args) {
		String sr="sunday";
		String rev="";
		//length method will return 6 length so we have to minus 1
		
		for(int i=(sr.length()-1);i>=0;i--) {
			rev=rev+sr.charAt(i);
		}
		System.out.println(rev);

	}

}
