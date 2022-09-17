import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		System.out.println("Entered number: " + inputFloat());
	}

	private static float inputFloat() {
		Scanner scanner = new Scanner(System.in);
		String input;
		do {
			System.out.println("Input a fractional number:");
			input = scanner.nextLine();
		} while (!isNumeric(input));
		scanner.close();
		float number = Float.parseFloat(input);
		return number;
	}

	private static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}


}