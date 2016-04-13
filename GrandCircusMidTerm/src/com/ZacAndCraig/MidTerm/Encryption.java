package com.ZacAndCraig.MidTerm;


public class Encryption {
	
	// This method is being used to call each stage of our encryption methods
		// and returns a String to the main application class
	public static String doEncryption(String message){
		
		// Guard clause
		if(message == null || message.length() == 0)
			throw new IllegalArgumentException();
		
		String encryptedMessage = null;
		char[] letters = splitMessage(message);
		char[] encryptedLetters = encryptMessage(letters);
		encryptedMessage = rebuildMessage(encryptedLetters);
		
		return encryptedMessage;
	}
	
	// This method splits the user's message into individual characters and stores in an array
	public static char[] splitMessage(String message){
		char[] letters = message.toCharArray();
		
		return letters;
	}
	
	// This method takes the previous array uses our encryption key to scramble the letters
	public static char[] encryptMessage(char[] letters2) {
		char[] encryptedLetters = new char[letters2.length];
		
		for (int i = 0; i < letters2.length; i++) {
			encryptedLetters[i] = (char) (letters2[i] + 4);
		}
		
		return encryptedLetters;
	}
	
	// This method takes the scrambled array and puts it into a StringBuilder object
	// We then convert it to a string and return it to the top method
	public static String rebuildMessage(char[] encryptedLetters){
		StringBuilder sb = new StringBuilder();
			sb.append(encryptedLetters);
		System.out.println(sb);
		
		return sb.toString();
	}

	
}
