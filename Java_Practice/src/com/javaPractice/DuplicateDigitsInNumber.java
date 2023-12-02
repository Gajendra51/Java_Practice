//wap to find duplicate digits in a number
package com.javaPractice;

public class DuplicateDigitsInNumber {

	public static void main(String[] args) {
		long num=1234567589L;
		String numStr = Long.toString(num);
		int length = numStr.length();
		for(int i=0; i<length-1; i++) {
			char currentDigit = numStr.charAt(i);
			for(int j=i+1; j<length-1; j++) {
				char compareDigit = numStr.charAt(j);
				if(currentDigit==compareDigit) {
					System.out.println("duplicate digit found "+currentDigit);
				}
			}
			
		}

		

	}

}
