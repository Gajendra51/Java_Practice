//Wap to swap two numbers without using Temporary variable
package com.javaPractice;

public class SwapNumbersWithoutTemp {

	public static void main(String[] args) {
		int a=2;
		int b=5;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The new value of a= "+a+" and b="+b);

	}

}
