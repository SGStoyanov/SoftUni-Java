import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;

public class PythagoreanNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] numbers = new int[n];
		int[] sum = new int[n];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		Arrays.sort(numbers);
		
		findPythagoreans(numbers);
	}
	
	private static void findPythagoreans(int[] arr) {
		  HashSet squares = new HashSet();
		  long square;
		  int counter = 0;
		  for (int num : arr) {
			  squares.add((long) num * num);
			  if (num == 0) {
					System.out.println("0*0 + 0*0 = 0*0");
			  }
		  }
		  for (int i = 0; i < arr.length - 1; ++i) {
			  for (int j = i + 1; j < arr.length; ++j) {
				  square = (long) arr[i] * arr[i] + (long) arr[j] * arr[j];
				  if (squares.contains(square)) {
					  System.out.println(arr[i] + "*" + arr[i] + " + " 
							  			+ arr[j] + "*" + arr[j] + " = "
							  + (long)Math.sqrt(square) + "*" + (long)Math.sqrt(square));
					  counter++;
				  } 
			  }
		  }
		  if (counter == 0) {
			System.out.println("No");
		}
 	}
}