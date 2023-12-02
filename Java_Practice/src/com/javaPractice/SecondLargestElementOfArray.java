//wap to find the second largest element of an array
package com.javaPractice;

public class SecondLargestElementOfArray {

	public static void main(String[] args){
		int[] arr = {44,2,56,32,12,325,6,89};
		int max = arr[0];
		int secMax = arr[1];
		for(int i=0; i < arr.length; i++ ) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]>arr[i]) {
					secMax=max;
					max=arr[j];
					
				}
			}
		}
		System.out.println("The second largest element of the array is "+secMax);

	}

}
