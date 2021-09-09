/**
 * decripts and encripts messages in two cyphers
 * @author Elizabeth Perez
 * 3/8/2020
 */
public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		for(int i = 0; i < plainText.length(); i++) {
			if(plainText.charAt(i) > UPPER_BOUND || plainText.charAt(i) < LOWER_BOUND) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {
		//Checks if plainText is in bounds
		if(!stringInBounds(plainText)) {
			return "Text is not in bounds.";
		}
		
		//Declare a character array called textArray to plainText length
		char[] textArray = new char[plainText.length()];
		
		//For integer i equal to 0, while i is less than plainText length, add 1 to i 
		for(int i = 0; i < plainText.length(); i++) {
			//Set textArray at position i to plainText at length i plus key 
			textArray[i] = (char) (plainText.charAt(i) + key);
			
			//While textArray at position i is greater than UPPER_BOUND
			while(textArray[i] > UPPER_BOUND) {
				//Set textArray at position i to textArray at position i minus RANGE 
				textArray[i] = (char) (textArray[i] - RANGE);
			}
			
			//While textArray at position i is less than LOWER_BOUND
			while(textArray[i] < LOWER_BOUND) {
				//Set textArray at position i to textArray at position i plus RANGE
				textArray[i] = (char) (textArray[i] + RANGE);
			}
		}
		
		//Return textArray as a string
		return String.copyValueOf(textArray);
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {
		//Checks if plainText is in bounds
		if(!stringInBounds(plainText)) {
			return "Text is not in bounds.";
		}
		
		//Declare a character array called keyArray to plainText length
		char[] keyArray = new char[plainText.length()];
		//Declare an integer called length and initialize it to 0 
		int length = 0;
		
		//While length is less than plainText length
		while(length < plainText.length()) {
			//Set keyArray at position length to bellasoStr char at len % bellasoStr length 
			keyArray[length] = bellasoStr.charAt(length % bellasoStr.length());
			//Add 1 to length
			length++;
		}
		
		//Declare a character array called textArray to plainText length 
		char[] textArray = new char[plainText.length()];

		//For integer i equal to 0, while i is less than plainText length, add 1 to i 
		for(int i = 0; i < plainText.length(); i++) {
			//Set textArray at position i to plainText at length i plus keyArray at position i
			textArray[i] = (char) (plainText.charAt(i) + (int) (keyArray[i]));
			
			//While textArray at position i is greater than UPPER_BOUND
			while(textArray[i] > UPPER_BOUND) {
				//Set textArray at position i to textArray at position i minus RANGE 
				textArray[i] = (char) (textArray[i] - RANGE);
			}
			
			//While textArray at position i is less than LOWER_BOUND
			while(textArray[i] < LOWER_BOUND) {
				//Set textArray at position i to textArray at position i plus RANGE
				textArray[i] = (char) (textArray[i] + RANGE);
			}
		}

		//Return textArray as a string
		return String.copyValueOf(textArray);
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedText, int key) {
		//Checks if encryptedText is in bounds
		if(!stringInBounds(encryptedText)) {
			return "Text is not in bounds.";
		}
		
		//Declare a character array called textArray to encryptedText length 
		char[] textArray = new char[encryptedText.length()];
		
		//For integer i equal to 0, while i is less than encryptedText length, add 1 to i
		for(int i = 0; i < encryptedText.length(); i++) {
			//Set textArray at position i to encryptedText at length i minus key 
			textArray[i] = (char) (encryptedText.charAt(i) - key);
	
			//While textArray at position i is greater than UPPER_BOUND
			while(textArray[i] > UPPER_BOUND) {
				//Set textArray at position i to textArray at position i minus RANGE 
				textArray[i] = (char) (textArray[i] - RANGE);
			}
			
			//While textArray at position i is less than LOWER_BOUND
			while(textArray[i] < LOWER_BOUND) {
				//Set textArray at position i to textArray at position i plus RANGE
				textArray[i] = (char) (textArray[i] + RANGE);
			}	
		}
		
		//Return textArray as a string
		return String.copyValueOf(textArray);
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		//Checks if encryptedText is in bounds
		if(!stringInBounds(encryptedText)) {
			return "Text is not in bounds.";
		}
		
		//Declare a character array called keyArray to encryptedText length
		char[] keyArray = new char[encryptedText.length()];
		//Declare an integer called length and initialize it to 0 
		int length = 0;
				
		//While length is less than encryptedText length
		while(length < encryptedText.length()) {
			//Set keyArray at position length to bellasoStr char at len % bellasoStr length 
			keyArray[length] = bellasoStr.charAt(length % bellasoStr.length());
			//Add 1 to length
			length++;
		}
				
		//Declare a character array called encryptedArray to plainText length 
		char[] textArray = new char[encryptedText.length()];
		
		//For integer i equal to 0, while i is less than encryptedText length, add 1 to i 
		for(int i = 0; i < encryptedText.length(); i++) {
			//Set textArray at position i to plainText at length i minus keyArray at position i
			textArray[i] = (char) (encryptedText.charAt(i) - (int) (keyArray[i]));
					
			//While textArray at position i is greater than UPPER_BOUND
			while(textArray[i] > UPPER_BOUND) {
				//Set textArray at position i to textArray at position i minus RANGE 
				textArray[i] = (char) (textArray[i] - RANGE);
			}
					
			//While textArray at position i is less than LOWER_BOUND
			while(textArray[i] < LOWER_BOUND) {
				//Set textArray at position i to textArray at position i plus RANGE
				textArray[i] = (char) (textArray[i] + RANGE);
			}
		}

		//Return textArray as a string
		return String.copyValueOf(textArray);
	}
}