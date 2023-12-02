//wap to find largest element of an array
package com.javaPractice;

public class LargestElementOfArray {

	public static void main(String[]args) {
		
		int[] arr = {11,24,35,56,89,4,90};
		int max =arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max<arr[i]) {
				max= arr[i];
			}
		}
		System.out.println("Largest element of the given array is "+max);
	}
	}
