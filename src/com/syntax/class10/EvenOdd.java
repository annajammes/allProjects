package com.sytax.class10;

public class EvenOdd {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 },
				{ 5, 6, 7,  8},
				{ 9,10, 11, 12, } };
	
		for (int i = 0; i <= 2; i++) {

			for (int j = 0; j <= 3; j++)
				 if(j==1) {
					System.out.println(arr[i][j] + " ");
					break;
				 }}
		System.out.println( " --------------");
					for (int i = 0; i <= 2; i++) {

						for (int j = 0; j <= 3; j++)
							 if(j==3) {
								System.out.println(arr[i][j] + " ");
								break;}
	}

}}
