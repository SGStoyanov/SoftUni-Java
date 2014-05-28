package syntaxPackage;
import java.util.Locale;
import java.util.Scanner;

/* Problem 3.	Points inside a Figure
Write a program to check whether a point is inside or outside of the figure below. 
The point is given as a pair of floating-point numbers, separated by a space. 
Your program should print "Inside" or "Outside". */

public class PointsInsideAFigure {

	public static void main (String[] args) {
		
		while (true) {
			Locale.setDefault(new Locale("en", "US"));
			Scanner prompt = new Scanner(System.in);
			float pointX = prompt.nextFloat();
			float pointY = prompt.nextFloat();

			// Checking whether the points are inside the figure
			if (pointX >= 12.5 && pointX <= 17.5 && pointY >= 8.5 && pointY <= 13.5) { 
				System.out.println("Inside");
			} else if (pointX >= 12.5 && pointX <= 22.5 && pointY >= 6 && pointY <= 8.5) {
				System.out.println("Inside");
			} else if (pointX >= 20 && pointX <= 22.5 && pointY >= 8.5 && pointY <= 13.5) {
				System.out.println("Inside");
			} else {
				System.out.println("Outside");
			}
		}
	}
}
