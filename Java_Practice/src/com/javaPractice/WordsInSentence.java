//wap to count words in a sentence
package com.javaPractice;

public class WordsInSentence {

	public static void main(String[] args) {
		String str = "Gajendra Kumar Singh is Software Test Engineer";
		String[] words = str.split(" ");
		int wordsCount = words.length;
		System.out.println("No. of words in the given sentence is "+wordsCount);

	}

}
