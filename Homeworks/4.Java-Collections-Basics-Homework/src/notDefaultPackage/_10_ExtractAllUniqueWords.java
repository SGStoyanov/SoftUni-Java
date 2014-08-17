/* Problem 10.	Extract All Unique Words
At the first line at the console you are given a piece of text. Extract all words from it and print them in alphabetical order. 
Consider each non-letter character as word separator. Take the repeating words only once. Ignore the character casing. 
Print the result words in a single line, separated by spaces. */

package notDefaultPackage;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _10_ExtractAllUniqueWords {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] text = input.nextLine().toLowerCase().split("[\\W ]+");
		Set<String> uniqueWords = new TreeSet<String>();
		
		for (String string : text) {
			uniqueWords.add(string);
		}
		for (String word : uniqueWords) {
			System.out.print(word + " ");
		}
	}
}
