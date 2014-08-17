// Problem 8.	* Count of Equal Bit Pairs
// Write a program to count how many sequences of two equal bits ("00" or "11") can be found in the binary representation of 
// given integer number n (with overlapping). 

package syntaxPackage;

import java.util.Scanner;

public class CountOfEqualBitPairs {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numN = input.nextInt();
		String numStr = Integer.toBinaryString(numN);
		System.out.println(numStr);
		char[] charArr = numStr.toCharArray();
		int count = 0;
		
		for (int i = 0; i < charArr.length - 1; i++) {
			if (charArr[i] == charArr[i+1]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
