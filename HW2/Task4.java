import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		boolean empty = true;
		Scanner scanner = new Scanner(System.in);
		while (empty) {
			try {
				inputFloat(scanner);
				empty = false;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		scanner.close();
	}

	private static void inputFloat(Scanner scanner) throws Exception {
		System.out.println("Input something:");
		String input = scanner.nextLine();
		if (input == "") {
			throw new Exception("You cannot enter empty lines");
		}
	}
}