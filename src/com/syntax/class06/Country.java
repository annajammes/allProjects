
package com.sytax.class06;

import java.util.Scanner;

public class Country {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter your country name");
		String country = in.next();
		String language;
		switch(country.toLowerCase()) {
		case "pakistan":
			language="urdu";
			break;
		case "india":
			language="hindi";
			break;
		case "turkey":
			language="turkish";
			break;
			default:
				language="unknown";
		
		}
		if(!(language=="unknown"))
		{
			System.out.println(language);
		}else {System.out.println("invalid");
	}
}
}