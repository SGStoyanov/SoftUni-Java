import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Problem 8.	Sum Numbers from a Text File
// Write a program to read a text file "Input.txt" holding a sequence of integer numbers, each at a separate line. 
// Print the sum of the numbers at the console. Ensure you close correctly the file in case of exception or in case of normal execution.
// In case of exception (e.g. the file is missing), print "Error" as a result. 

public class _8_SumNumsFromTxtFile {

	public static void main (String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		File file = new File(".\\src\\Input.txt");
		BufferedReader reader = null;
		long sum = 0;
		
		try {
			reader = new BufferedReader(new FileReader(file));
			String text = null;
			while ((text = reader.readLine()) != null) {
				list.add(Integer.parseInt(text)); // Adding each found integer to a ArrayList
				sum += Integer.parseInt(text); // Calculating the sum by adding the integer on read on each line
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println("Error \nFile not found!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) { //If the reader fin
					System.out.println("Numbers read from Input.txt:  " + list);
					System.out.println("Sum: " + sum);
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
