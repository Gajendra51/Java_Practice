//wap to find GCD of two numbers
package com.javaPractice;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		int num1= 26, num2= 96;
		while(num1!=num2) {
			if(num1>num2) {
				num1= num1-num2;
			}
			else {
				num2= num2-num1;
			}
		}
       System.out.println("The GCD is "+num1);
	}

}
