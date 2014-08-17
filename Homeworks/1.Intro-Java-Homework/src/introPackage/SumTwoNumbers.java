package introPackage;

import java.util.Scanner;

public class SumTwoNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int intA = scan.nextInt();
		int intB = scan.nextInt();
		scan.close();
		
		System.out.println("result: " + (intA + intB));
	}

}
