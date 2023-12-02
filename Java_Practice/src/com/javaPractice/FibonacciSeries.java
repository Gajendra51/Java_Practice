//wap to find fibonacci series upto given number of terms
package com.javaPractice;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n= 10;
		int a= 0, b= 1;
		int sum= 0;
		System.out.print("The ficonacci series upto 10 terms is ");
		for(int i=0; i<n;i++) {
		    sum= a+b;
			a= b;
			b= sum;
			System.out.print(sum+" ");
		}
        
	}

}
