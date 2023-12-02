//wap to find no. of occurance of a character(e)
package com.javaPractice;

public class NoOfOccurance {

	public static void main(String[] args) {
		String str = "abcdeabee";
		char[] ch = str.toCharArray();
		int count=0;
		char target = 'b';
		for(int i=0; i<ch.length; i++) {
			if(ch[i]==target)
				count = count+1;
	}
		System.out.println("No. of occurance of "+target+" is "+count);

	}

}
