//wap to reverse order of words of a sentence
package com.javaPractice;

public class ReverseOrderOfWords {

	public static void main(String[] args) {
		String str = "Gajendra Kumar Singh is a Software Test Engineer";
		String[] words =str.split(" ");
		int left = 0;
		int right= words.length-1;
		while(left<right) {
			String temp = words[right];
			words[right] = words[left];
			words[left] = temp;
			left++;
			right--;
			
		}
		String result = String.join(" ", words);
		System.out.println("Reverse sentence is "+result);

	}

}
