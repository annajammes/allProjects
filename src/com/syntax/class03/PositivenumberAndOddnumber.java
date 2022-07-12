package com.sytax.class03;

public class PositivenumberAndOddnumber {

	public static void main(String[] args) {
		int num=99;
		if(num<0) {
		System.out.println("it's negative number ");

	}else if(num>0){
		System.out.println(num+" "+"it's positive number. ");
		if(num%2==0) {
			System.out.println("it's even number.");
		}else {
			System.out.println("it's odd.");
		}
}
}
}