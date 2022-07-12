package com.sytax.class13;

public class CheckPalinorm {

	public static void main(String[] args) {
		String sr="aba";
		StringBuilder ar=new StringBuilder(sr);
		ar.reverse();
		if(sr.equals(ar.toString())) {
System.out.println("it a palinorm");
	} else {
		System.out.println("not a palinorm");
	}

}}
