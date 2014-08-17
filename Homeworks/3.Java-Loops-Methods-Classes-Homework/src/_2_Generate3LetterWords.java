/* Problem 2.	Generate 3-Letter Words
Write a program to generate and print all 3-letter words consisting of given set of characters. For example if we have the 
characters 'a' and 'b', all possible words will be "aaa", "aab", "aba", "abb", "baa", "bab", "bba" and "bbb". 
The input characters are given as string at the first line of the input. Input characters are unique (there are no repeating characters). */

import java.util.Scanner;

public class _2_Generate3LetterWords {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		String letters = input.nextLine();
		
		if (letters.length() <= 3) {
			for (int i = 0; i < letters.length(); i++) {
                for (int j = 0; j < letters.length(); j++) {
                        for (int k = 0; k < letters.length(); k++) {
                                String treeLetterWord = "" + letters.charAt(i) + letters.charAt(j) + letters.charAt(k);
                                System.out.print(treeLetterWord + " ");
                        }
                }
			}
		}
	}
}