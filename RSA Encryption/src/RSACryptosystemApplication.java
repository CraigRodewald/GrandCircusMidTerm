import java.util.Scanner;

public class RSACryptosystemApplication {
	public static void main(String[] args) {
		// Initialize variables
		Scanner scan = new Scanner(System.in);
		String[] menuItems = {"====== Main Menu ======",
							  "| 1-Encrypt Message   |",
							  "| 2-Decrypt Message   |",
							  "| 3-Enter New Message |",
							  "| 4-Exit              |",
							  "======================="};
		String menuSelection, message;
		
		System.out.println("Welcome to the Cryptography Application");
		System.out.println("\n");
		for (String item : menuItems) {
			System.out.println(item);
		}
	}
}
