package notDefaultPackage;
// Problem 1.	Sort Array of Numbers
// Write a program to enter a number n and n integer numbers and sort and print them. Keep the numbers in array of integers: int[]. 

import java.util.Arrays;
import java.util.Scanner;

public class _01_SortArrayOfNumbers {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		int nNum = input.nextInt();
		int[] numbers = new int[nNum];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		Arrays.sort(numbers);
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}
}
