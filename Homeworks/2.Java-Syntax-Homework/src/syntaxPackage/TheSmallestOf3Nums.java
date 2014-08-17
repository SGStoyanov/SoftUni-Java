// Problem 4.	The Smallest of 3 Numbers
// Write a program that finds the smallest of three numbers. 

package syntaxPackage;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TheSmallestOf3Nums {
	
	public static void main (String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		Scanner input = new Scanner(System.in);
		DecimalFormat myFormat = new DecimalFormat("###.#");
		float[] numsArray = new float[3];
		
		for (int index = 0; index < numsArray.length; index++) {
			numsArray[index] = input.nextFloat();
		}

		Arrays.sort(numsArray);
		System.out.println("Smallest: " + myFormat.format(numsArray[0]));
	}
}
