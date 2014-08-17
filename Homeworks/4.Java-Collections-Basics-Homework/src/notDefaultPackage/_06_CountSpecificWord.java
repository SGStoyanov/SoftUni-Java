/* Problem 6.	Count Specified Word
Write a program to find how many times a word appears in given text. The text is given at the first input line. 
The target word is given at the second input line. The output is an integer number. Please ignore the character casing. 
Consider that any non-letter character is a word separator. */

package notDefaultPackage;

import java.util.Scanner;

public class _06_CountSpecificWord {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] text = input.nextLine().split("[\\W' ]+"); // Searching for all non-letter characters, ' and space and using them as a separator.
		String neededWord = input.nextLine();
		byte counter = 0;
		
		for (String words : text) {
			if (words.equalsIgnoreCase(neededWord)) { // As required, the casing of the words is ignored.
				counter++;
			}
		}
		System.out.println(counter);
	}
}
