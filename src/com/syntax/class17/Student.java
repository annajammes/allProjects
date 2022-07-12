package com.syntax.class17;

public class Student {
	String name;
	String address;
	Student(String name ,String address){
		this.name=name;
		this.address=address;
		
	}
	public void displayInfo () {
		System.out.println(name+" \n "+address);
	}
	

}
