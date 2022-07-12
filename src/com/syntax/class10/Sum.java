package com.sytax.class10;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12, } };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++)
				 sum=sum+arr[i][j];
				

		}System.out.println("the sum is "+ sum);
	}

}
