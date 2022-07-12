package com.sytax.class8;

public class Fazol {

	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) {

			for (int j = 5; j >= 2; j--) {

				for (int k = 5; k >= 3; k--) {

					for (int l = 5; l >= 4; l--) {
						if (i == 5 && j == 5 && k == 5 && l == 5) {
							System.out.println(i + " " + j + " " + k + " " + l);
						}

					}
					if (i == 4 && j == 4 && k == 4) {
						System.out.println(i + " " + j + " " + k);
					}
				}
				if (i == 3 && j == 3) {
					System.out.println(i + " " + j);
				}
			}
			if (i == 2 ) {
				System.out.println(i + " ");	}

	}

	}}
