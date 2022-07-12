package com.sytax.class13;

public class NotEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sr="sundayp";
		if(!sr.isEmpty()) {
			if(!(sr.length()%2==0)&&sr.length()>=3) {
				int half=sr.length()/2;
				System.out.println(sr.charAt(half)); 
			}
		}
		
	}

}
