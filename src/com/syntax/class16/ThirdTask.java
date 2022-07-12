package com.syntax.class16;

public class ThirdTask {
	/*
	 *  we use the word static with private  because our main function
	 * which is trying to use this method is static and a static can only access 
	 * static function.
	 */
	private static String vowelsStirng(String string) {
		string.replaceAll("[^aeiouAEIOU]", "");
return string;
	}
 

public static void main(String[] args){

	ThirdTask objectfirst =new ThirdTask();
	System.out.println( objectfirst.vowelsStirng("saima"));
	}}
