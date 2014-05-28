package notDefaultPackage;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/* Problem 3.	Largest Sequence of Equal Strings
Write a program that enters an array of strings and finds in it the largest sequence of equal elements. 
If several sequences have the same longest length, print the leftmost of them. 
The input strings are given as a single line, separated by a space. */

public class _03_LargestSequenceOfEqualStrings {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
        String[] words = sc.nextLine().split(" ");
       
        int countOfEqualStrings = 1;
        int maxcountOfEqualStrings = 1;
        String word = words[0] + "";
        for (int i = 0; i < words.length - 1; i++) {
                //Next word is equal
                if (words[i].equals(words[i+1])) {
                        countOfEqualStrings++;
                        if (i == words.length - 2) {
                                if (maxcountOfEqualStrings < countOfEqualStrings) {
                                        word = words[i] + "";
                                        maxcountOfEqualStrings = countOfEqualStrings;
                                }
                        }
                }
                //Next word is not equal
                else {
                        if (maxcountOfEqualStrings < countOfEqualStrings) {
                                word = words[i] + "";
                                maxcountOfEqualStrings = countOfEqualStrings;
                        }
                        countOfEqualStrings = 1;
                }
        }
       
        for (int i = 0; i < maxcountOfEqualStrings; i++) {
                System.out.print(word + " ");
        }
	}
}
