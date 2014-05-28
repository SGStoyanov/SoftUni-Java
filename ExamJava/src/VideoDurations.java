
import java.util.ArrayList;
import java.util.Scanner;


public class VideoDurations {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> numbers = new ArrayList<>();
		
		boolean check = true;
		while (check) {
			numbers.add(input.nextLine());
			if (numbers.contains("End")) {
				check = false;
			}
			
		}
		
		if (!check) {
			int hoursSum = 0;
			int minutesSum = 0;
			numbers.remove("End");
			for (String number : numbers) {
				String[] minutesStrArr = number.split(":");
				hoursSum += Integer.parseInt(minutesStrArr[0]);
				minutesSum += Integer.parseInt(minutesStrArr[1]);
			}
			if (minutesSum % 60 == 0) {
				hoursSum += minutesSum/60;
			} else if (minutesSum > 60) {
				int tempMins = minutesSum - ((minutesSum/60)*60);
				hoursSum += minutesSum/60;
				minutesSum = tempMins;
			}
			System.out.printf("%d:%02d", hoursSum, minutesSum);
		}	
	}
}