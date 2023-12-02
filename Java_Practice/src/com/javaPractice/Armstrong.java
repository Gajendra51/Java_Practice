//wap to find Armstrong number in a given range
package com.javaPractice;

public class Armstrong {

	public static void main(String[] args) {
		int start =1;
		int end = 1000;
		for(int num=start; num<=end; num++) {
			double sum =0;
			int temp = num;
			while(temp!=0) {
				int digit = temp%10;
				sum = sum+ Math.pow(digit, 3);
				temp= temp/10;
			}
			if(sum==num) {
				System.out.println(num+" is Armstrong");
			}
		}

	}

}
