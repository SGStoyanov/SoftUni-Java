// Problem 7.	Count of Bits One
// Write a program to calculate the count of bits 1 in the binary representation of given integer number n. 

package syntaxPackage;

import java.util.Scanner;

public class CountOfBitsOne {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String binaryStr = Integer.toBinaryString(num); 
		int countOnes = Integer.bitCount(num);
		
		System.out.println(binaryStr + " Count ones: " + countOnes);
	}
}