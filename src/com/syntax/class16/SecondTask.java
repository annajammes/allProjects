package com.syntax.class16;

public class SecondTask {
//key word static because we want to
	// call this method with class name and
	// static is variables are used with class name
	
	public static String reverseStirng(String string) {
		StringBuilder builerObject =new StringBuilder(string);
		return builerObject.reverse().toString();
	}

}
