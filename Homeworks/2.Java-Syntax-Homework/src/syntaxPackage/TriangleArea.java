package syntaxPackage;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

/* Problem 2.	Triangle Area
 * Write a program that enters 3 points in the plane (as integer x and y coordinates), 
 * calculates and prints the area of the triangle composed by these 3 points.
 * Round the result to a whole number. 
 * In case the three points do not form a triangle, print "0" as result. 
 */

public class TriangleArea {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] pointA = new int[2];
		int[] pointB = new int[2];
		int[] pointC = new int[2];
		
		Pattern delimiters = Pattern.compile(System.getProperty("line.separator")+"|\\s");
		input.useDelimiter(delimiters); 
		
		for (int i = 0; i < pointA.length; i++) {
			pointA[i] = input.nextInt();
		}
		for (int i = 0; i < pointB.length; i++) {
			pointB[i] = input.nextInt();
		}
		for (int i = 0; i < pointC.length; i++) {
			pointC[i] = input.nextInt();
		}
		
		// Checking for equal points - if such exist the needed figure wouldn't be a triangle
		if (!(Arrays.equals(pointA, pointB)) || !(Arrays.equals(pointA, pointC)) || !(Arrays.equals(pointB, pointC))) {
			int area = Math.abs(pointA[0]*(pointB[1] - pointC[1]) + pointB[0]*(pointC[1] - pointA[1]) + pointC[0]*(pointA[1] - pointB[1]));
			System.out.println("Area: " + area/2);
		} else {
			System.out.println(0);
		}
		
	}
}
