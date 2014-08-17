package syntaxPackage;
// Problem 5.	Decimal to Hexadecimal
// Write a program that enters a positive integer number num and converts and prints it in hexadecimal form. 
// You may use some built-in method from the standard Java libraries. 

import java.util.Scanner;

public class DecToHex {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		int convInt = input.nextInt();
		
		System.out.printf("%X\n", convInt); // Converting decimal to hexadecimal (with capital letters)
	}
}
