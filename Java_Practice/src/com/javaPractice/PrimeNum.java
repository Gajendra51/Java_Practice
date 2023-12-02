//wap to check if num is prime
package com.javaPractice;

public class PrimeNum {

	public static void main(String[] args) {
		
      int num = 31;
      boolean isPrime = true;
      for(int i=2; i<=Math.sqrt(num); i++) {
    	  if(num%i==0) {
    		  isPrime = false;
    		  break;
    	  }
      }
      if(isPrime==true) {
    	  System.out.println("Given number "+num+" is a prime number");
      }
      else {
    	  System.out.println("Given number "+num+" is NOT a prime number");
      }
	}

}
