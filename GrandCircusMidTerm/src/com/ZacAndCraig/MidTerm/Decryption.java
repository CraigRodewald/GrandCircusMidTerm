package com.ZacAndCraig.MidTerm;

public class Decryption {

	public static String doDecryption(String message) {

		if (message == null || message.length() == 0)
			throw new IllegalArgumentException();
 
		char[] letters = splitMessage(message);

		char[] decryptedLetters = decryptMessage(letters);

		String decryptedMessage = rebuildMessage(decryptedLetters);

		return decryptedMessage;
	}

	public static char[] splitMessage(String message) {
		char[] letters = message.toCharArray();
		return letters;
	}

	public static char[] decryptMessage(char[] letters2) {
		char[] decryptedLetters = new char[letters2.length];

		for (int i = 0; i < letters2.length; i++) {
			decryptedLetters[i] = (char) (letters2[i] - 4);
		}
		return decryptedLetters;
	}

	public static String rebuildMessage(char[] decryptedLetters) {
		StringBuilder sb = new StringBuilder();
		sb.append(decryptedLetters);
		System.out.println(sb);
		return sb.toString();
	}
}
