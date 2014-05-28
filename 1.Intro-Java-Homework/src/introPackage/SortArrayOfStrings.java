package introPackage;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfStrings {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] strArray = new String[n];
		
		for (int i = 0; i < n; i++) {
			strArray[i] = scan.next();
		}
		
		Arrays.sort(strArray);
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}
}
