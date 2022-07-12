package com.sytax.clas15;

public class Student {
	String name;
	String Id;
	static int noOfStudents=0;
	static String CEO="sumair";
	void incStaic() {
	noOfStudents++;
	System.out.println("The CEO of sytax  "+CEO);
		System.out.println(" "+name+" "+Id+" "+noOfStudents);
	}

}
