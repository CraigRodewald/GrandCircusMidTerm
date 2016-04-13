package com.CraigRodewald.MidTerm;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.ZacAndCraig.MidTerm.Decryption;
import com.ZacAndCraig.MidTerm.Encryption;
import com.ZacAndCraig.MidTerm.EncryptionApplication;

public class TestEncryptionApp {

	@Before
	public void setUp() throws Exception {
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test(expected = IllegalArgumentException.class)
	public void testUserMessageIsNotNull() {
		Encryption.doEncryption(null);
		
		thrown.expect(IllegalArgumentException.class);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testUserMessageIsNotEmpty() {
		Encryption.doEncryption("");
		
		thrown.expect(IllegalArgumentException.class);
	}
	
	@Test
	public void testSplitMethodReturnsCharArray() throws Exception {
		char[] expected = {'t', 'e', 's', 't'};
		char[] result = Encryption.splitMessage("test");
		
		assertArrayEquals(expected, result);
	}
	@Test
	public void testEncryptMessageRetunrsEncryptedArray() throws Exception {
		char[] expected = {'x','i','w','x'};
		char[] input = {'t', 'e', 's', 't'};
		
		char[] result = Encryption.encryptMessage(input);
		
		assertArrayEquals(expected, result);
	}
	@Test
	public void testRebuildMessageIntoString() throws Exception {
		char[] input = {'x', 'i', 'w', 'x'};
		String result = Encryption.rebuildMessage(input);
		
		assertEquals("xiwx", result);
	}
	@Test
	public void testDoEncryptionReturnsEncryptedMessage() throws Exception {
		String result = Encryption.doEncryption("test");
		assertEquals("xiwx", result);
		
	}

	//Decryption
	
	@Test(expected = IllegalArgumentException.class)
	public void testDecryptionUserMessageIsNotNull() {
		Decryption.doDecryption(null);
		
		thrown.expect(IllegalArgumentException.class);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDecryptionUserMessageIsNotEmpty() {
		Encryption.doEncryption("");
		
		thrown.expect(IllegalArgumentException.class);
	}
	
	@Test
	public void testDecryptionSplitMethodReturnsCharArray() throws Exception {
		char[] expected = {'x', 'i', 'w', 'x'};
		char[] result = Decryption.splitMessage("xiwx");
		
		assertArrayEquals(expected, result);
	}
	@Test
	public void testDecryptionEncryptMessageRetunrsEncryptedArray() throws Exception {
		char[] expected = {'t','e','s','t'};
		char[] input = {'x', 'i', 'w', 'x'};
		
		char[] result = Decryption.decryptMessage(input);
		
		assertArrayEquals(expected, result);
	}
	@Test
	public void testDecryptionRebuildMessageIntoString() throws Exception {
		char[] input = {'t', 'e', 's', 't'};
		String result = Decryption.rebuildMessage(input);
		
		assertEquals("test", result);
	}
	@Test
	public void testDoDecryptionReturnsEncryptedMessage() throws Exception {
		String result = Decryption.doDecryption("xiwx");
		assertEquals("test", result);
		
	}
	
}
