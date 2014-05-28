import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Problem 6.	Random Hands of 5 Cards
//Write a program to generate n random hands of 5 different cards form a standard suit of 52 cards. 

public class _6_RandomHandsOf5Cards {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		int handsTotal = input.nextInt();
		
		char[] suits = {'♣', '♦', '♥', '♠'};
		String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] pairs = new String[5];
		ArrayList list  = new ArrayList<>();
		int count = 5;
		
		for (int i = 0; i < handsTotal; i++) {
			for (int j = 0; j < count; j++) {
				String cardRandom = (cards[new Random().nextInt(cards.length)]);
				char suitRandom = (suits[new Random().nextInt(suits.length)]);
				String match = cardRandom + suitRandom;
				
				if (list.contains(match)) {
					count++;
				} else {
					list.add(match);
				}
			}
			count = 5;
			for (Object pair : list) {
				System.out.print(pair + " ");
			}
			list.clear();
			System.out.println();
		}
	}
}
