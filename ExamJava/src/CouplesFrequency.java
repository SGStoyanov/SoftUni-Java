import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class CouplesFrequency {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		Map<String, Integer> numbersMap = new LinkedHashMap<String, Integer>();
		for (String number : numbers) {
			Integer count = numbersMap.get(number);
			if (count == null) {
				count = 0;
			}
			numbersMap.put(number, count + 1);
		}
		for (Map.Entry<String, Integer> entry : numbersMap.entrySet()) {
			double percentage = (double) entry.getValue() * 100 / numbers.length;
			System.out.printf("%s -> %.2f%%\n", entry.getKey(), percentage);
		}
		

	}
}