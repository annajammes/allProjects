package com.sytax.class13;

import java.util.Scanner;

public class CheckPawrd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String userPass = "123456789s";
		System.out.println("please your user name");
		String name = in.next();
		System.out.println("please your password");
		String pass = in.next();

		if (pass.equals(userPass)) {
			System.out.println("password  matched");
		} else if (!pass.equals(userPass)) {
			System.out.println("password not matched");
		}

		if (!name.isEmpty() && !pass.isEmpty()) {
			if (pass.length() < 8) {
				System.out.println("password is too short");
				if (pass.contains(name)) {
					System.out.println("password cannot contains username");
				}}  
		}
	}

}
