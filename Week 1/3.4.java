// Author: Julia Green

import textio.TextIO;

public class wordSplitter {
    public static void main(String[] args) {
		string input;
		char word;
		int i;
		
		System.out.println("Please enter a sentence.");
		input = TextIO.getlnString();
		
		for (i = 0; i <= input.length; i++) {
			word = input.charAt(i);
			System.out.println(word); 
		}
		System.out.println(); 		
	} // main end
} // class end