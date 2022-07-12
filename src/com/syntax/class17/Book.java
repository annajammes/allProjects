package com.syntax.class17;

public class Book {

	String name;
	int id;
	String color;
	 Book() {
System.out.println("1#default constructor is called ");
	}

	Book(String name, int id, String color) {
		this.name = name;
		this.id = id;
		this.color=color;
	}

	public void displayInfo() {
		System.out.println("2#second constructor is called ");
		System.out.println(name + " \n " + id +  color);
	}
}
