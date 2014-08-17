package notDefaultPackage;
/* Problem 2.	Sequences of Equal Strings
Write a program that enters an array of strings and finds in it all sequences of equal elements. 
The input strings are given as a single line, separated by a space. */

import java.util.Scanner;

public class _02_SequencesOfEqualStrings {

	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		String[] strArr = input.nextLine().split(" ");
		
		System.out.print(strArr[0]);
		for (int i = 1; i < strArr.length; i++) {
			if (strArr[i].equals(strArr[i - 1])) {
				System.out.print(" " + strArr[i]);
			} else {
				System.out.println();
				System.out.print(strArr[i]);
			}
		}
	}
}
