//wap to find factorial of a given number
package com.javaPractice;

public class Facto {

	public static void main(String[] args) {
		int num = 9;
		long facto = 1;
		for(int i=1; i<=num; i=i+1) {
			facto= facto*i;
		}
		System.out.println("Factorial of given number is "+facto);
		
				
	
	}

}
