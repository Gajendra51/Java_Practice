//wap to reverse a given String
package com.javaPractice;

public class ReverseString {

	public static void main(String[] args) {
		String str ="elephant";
		char[] ch = str.toCharArray();
		int left = 0;
		int right=ch.length-1;
		while(left<right) {
			char temp = ch[right];
			ch[right] = ch[left];
			ch[left] = temp;
			left++;
			right--;
		}
		//String reverse = String.join(str, args);
		System.out.println(ch);
		}
	}


