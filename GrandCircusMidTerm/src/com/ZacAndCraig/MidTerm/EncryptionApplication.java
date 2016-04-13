package com.ZacAndCraig.MidTerm;
	
//     Write encrypted message to file
 //     Read decrypted message from file

import java.util.Scanner;

public class EncryptionApplication {
	public static void main(String[] args) {
		
		// Initialize variables
		Scanner scan = new Scanner(System.in);
		String menuSelection;
		String[]optionMenu = { "Main Menu", "1-Encrypt Message", "2-Decrypt Message", "3-Enter New Message",
				"4-Exit"};
		
		// Display title bar message
		displayPrompt("Welcome to the Cryptography Application");
		
		// Ask user for input
		displayPrompt("\nPlease enter a message: ");
		String message = getUserMesssage(scan);
		
		// Main program loop
		do {
			
			// Create the main menu
			getMenu(optionMenu);
			
			// Ask user to make a selection from menu options
			displayPrompt("Enter a selection: ");
			menuSelection = getUserMesssage(scan);
			
			// Take user input and convert it into an integer to use in switch statement
			switch (Integer.parseInt(menuSelection)) {
			
			// Option 1: Encrypt the message
			case 1:
				message = Encryption.doEncryption(message);
				break;
				
			// Option 2: Decrypt the message	
			case 2:
				message = Decryption.doDecryption(message);
				break;
				
			// Option 3: Enter a new message	
			case 3:
				displayPrompt("\nPlease enter a message: ");
				message = getUserMesssage(scan);
				break;
				
			// Option 4: Exit the program	
			case 4:
				System.out.println("Goodbye!");
				break;
			}
			
		// Continue to the loop until user decides to exit the program
		} while (!(Integer.parseInt(menuSelection)==4));
		
		// Close the Scanner object
		scan.close();
	}
	
	// This method only gets user input and always returns it in String form.
		// Program must Parse this input into the proper data type needed.
	public static String  getUserMesssage(Scanner scan){
		return scan.nextLine();
	}
	
	// This method only displays text to the user from the console
	public static void displayPrompt(String prompt){
		System.out.println(prompt);
	}
	
	// This method generates a menu system by passing in an array and displaying 
		// the menu items one by one through the use of a for each loop.
	public static void getMenu(String[] menu){
		for (String item : menu) {
			System.out.println(item);
		}
	}
}
