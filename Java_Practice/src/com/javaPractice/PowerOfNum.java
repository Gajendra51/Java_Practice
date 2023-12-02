//wap to find power of a given number
package com.javaPractice;

public class PowerOfNum {

	public static void main(String[] args) {
	   int num = 5;
	   int exponent = 3;
	   long result = 1;
	   for(int i =1; i<=exponent; i++) {
		   result= result*num;
	   }
	   System.out.println("Power of given number is "+result);

	}

}
