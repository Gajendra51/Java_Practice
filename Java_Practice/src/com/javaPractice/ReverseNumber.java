//wap to reverse digits of a given number
package com.javaPractice;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 123456789;
		int reverse = 0;
		int temp = 0;
		while(num>0) {
			 temp = num%10;
			 reverse = reverse*10+temp;
			 num = num/10;
		}
		System.out.println("Reverse of the given number "+num+" is "+reverse);

	}

}
