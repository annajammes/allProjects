package com.sytax.class9;

public class PrintGrade {
	
public static void main(String[] args) {

	char[] arr=new char[5];
	 arr[0] ='A';
	 arr[1] ='B';
	 arr[2] ='C';
	 arr[3] ='D';
	 arr[4] ='E';
	
	 for(int i=0;i<=4;i++) {
	 System.out.print(" "+arr[0]);
	 arr[0]+=1;
	 }
	 
	
}
}
