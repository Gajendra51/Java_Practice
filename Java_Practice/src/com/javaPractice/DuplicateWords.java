//wap to find duplicate words in a sentence
package com.javaPractice;

public class DuplicateWords {

	public static void main(String[] args) {
		String sentence = "good good people are always good good people";
		String[] words=sentence.split(" ");
		boolean[] visited= new boolean[words.length];
		for(int i=0; i<words.length; i++) {
			int count=1;
			if(visited[i]==false) {
			
				
				for(int j=i+1; j<words.length; j++) {
					if(words[i].equalsIgnoreCase(words[j])) {
						count++;
						visited[i] = true;
					
					}
					
				}
				visited[i] = true;
				
				}
			
			if(count>1) {
				System.out.println(words[i]+" occurs "+count+" times");
				
			}
		}

	}

}
