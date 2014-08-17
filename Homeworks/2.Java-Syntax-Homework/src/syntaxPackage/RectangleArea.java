package syntaxPackage;
import java.util.Scanner;

// Problem 1.	Rectangle Area
// Write a program that enters the sides of a rectangle (two integers a and b) and 
// calculates and prints the rectangle's area

public class RectangleArea {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sideA = input.nextInt();
		int sideB = input.nextInt();
		
		System.out.println("Rectangle's area: " + (sideA * sideB));
	}

}
