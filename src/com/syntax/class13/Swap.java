package com.sytax.class13;

public class Swap {

	public static void main(String[] args) {
		String ar="saima";
		String sr="naz";
		ar=ar+sr;
		sr=ar.replace(sr, "");
		ar=ar.replace(sr, "");
		System.out.println(ar);
		System.out.print(sr);
		

	}

}
