package notDefaultPackage;

import java.util.Scanner;

/* Problem 5.	Count All Words
Write a program to count the number of words in given sentence. Use any non-letter character as word separator. */

public class _05_CountAllWords {

	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String[] sentence = input.nextLine().split("[\\W' ]+");
		System.out.println(sentence.length);
	}
}
