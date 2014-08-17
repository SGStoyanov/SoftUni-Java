import java.util.Scanner;

/* Problem 1.	Symmetric Numbers in Range
Write a program to generate and print all symmetric numbers in given range [start…end] (0 ≤ start ≤ end ≤ 999). 
A number is symmetric if its digits are symmetric toward its middle. For example, the numbers 101, 33, 989 and 5 are symmetric, 
but 102, 34 and 997 are not symmetric. */ 

public class _1_SymmetricNumbersInRange {

	public static void main (String[] args) {
		
		Scanner prompt = new Scanner(System.in);
		int start = prompt.nextInt();
		int end = prompt.nextInt();
		
		if (start >= 0 && start <= end && end <= 999) {
			if (end < 10) {
				for (int i = start; i <= end; i++) {
					System.out.printf("%d ", i);
				}
			} else if (start >= 10 && end <= 99) {
				for (int i = start; i <= end; i++) {
					if ((i % 10) == (i / 10)) {
						System.out.printf("%d ", i);
					}
				}
			}
			else if (start>= 100) {
				for (int i = start; i <= end; i++) {
					if (i % 10 == i / 100) {
						System.out.printf("%d ", i);
					}
				}
			}
		}
	}
}
