package com.sytax.class9;

import java.util.Scanner;

public class CountryName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] arr = { "pakistan", "india", "aus" };

		System.out.println("please enter the names of country");
		String name = scan.next();

		if (name.equalsIgnoreCase("pakistan")) {
			System.out.println("islama");
		} else if (name.equalsIgnoreCase("india")) {
			System.out.println("mubia");
		} else if (name.equalsIgnoreCase("aus")) {
			System.out.println("lon");
		}

	}

}
