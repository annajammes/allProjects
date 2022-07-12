package com.sytax.class07;

public class EvenOdd {

	public static void main(String[] args) {
		int sum=0;
		for(int i=2;i<=20;i+=2)
			
		{
			System.out.print(i+" ");
			
			sum+=i;
			
		}
		System.out.print("\n"+"(sum of all even number upto 20)"+sum);
System.out.println("\n"+"________________________________");
		
		for(int i=1;i<=20;i+=2)
		{
			System.out.print(i+" ");
		}

	}

}
