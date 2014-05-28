import java.util.Scanner;


public class Largest3Rectangles {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] rectanglesAsStrings = input.nextLine().split("[\\D x]+");
		int[] squareSides = new int[rectanglesAsStrings.length];
		
		for (int i = 0; i < rectanglesAsStrings.length; i++) {
			//squareSides[i] = Integer.parseInt(rectanglesAsStrings[i]);
		}
		for (int i : squareSides) {
			System.out.print(i + " ");
		}
	}

}
