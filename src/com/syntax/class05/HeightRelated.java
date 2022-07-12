package com.sytax.class05;

import java.util.Scanner;

public class HeightRelated {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter height in inches");
		int height = in.nextInt();
		if (height > 0 && height < 60) {
			System.out.println("short");

		}
		if (height > 60 && height < 72) {
			System.out.println("medium");

		}
		if (height > 72) {
			System.out.println("tall");

		}

	}

}
