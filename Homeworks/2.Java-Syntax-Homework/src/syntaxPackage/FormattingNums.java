/* Problem 6.	Formatting Numbers
Write a program that reads 3 numbers: an integer a (0 ≤ a ≤ 500), a floating-point b and a floating-point c 
and prints them in 4 virtual columns on the console. Each column should have a width of 10 characters. 
The number a should be printed in hexadecimal, left aligned; then the number a should be printed in binary 
form, padded with zeroes, then the number b should be printed with 2 digits after the decimal point, right aligned
, the number c should be printed with 3 digits after the decimal point, left aligned. */

package syntaxPackage;

import java.util.Locale;
import java.util.Scanner;

public class FormattingNums {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		Scanner input = new Scanner(System.in);
		int aNum = input.nextInt();
		
		// Checking if the first number is in the requested range
		if (aNum >= 0 && aNum <= 500) {
			float bNum = input.nextFloat();
			float cNum = input.nextFloat();
			String aToStr = String.format("%10s", Integer.toBinaryString(aNum)).replace(' ', '0');
			System.out.printf("|%-10X|%10s|%10.2f|%-10.3f|", aNum, aToStr, bNum, cNum);
		} else {
			System.out.println("Number a - out of range!");
		}
		
	}
}
