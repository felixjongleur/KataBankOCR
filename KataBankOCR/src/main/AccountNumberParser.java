package main;

public class AccountNumberParser {
		
	final int WIDTH = 3;
	final int TOTALWIDTH = 27;
	final int DIGITS = 9;	
	
	public String convertAccountNumber(String accountNumber) {
		String digits = "";
		for(int index = 0; index < DIGITS; index++) {
			digits += convertDigitAtIndex(index, accountNumber);
		}
		if(!hasAllDigits(digits)) {
			return digits + " ILL";
		} else if(!hasValidCheckSum(digits)) {
			return digits + " ERR";
		}
		return digits;
	}

	boolean hasAllDigits(String digits) {
		if(digits.indexOf('?') != -1)
			return false;
		return true;
	}

	String convertDigitAtIndex(int index, String accountNumber) {
		String top    = accountNumber.substring(index * WIDTH, index * WIDTH + WIDTH);
		String middle = accountNumber.substring(index * WIDTH + TOTALWIDTH, index * WIDTH + TOTALWIDTH + WIDTH);
		String bottom = accountNumber.substring(index * WIDTH + 2 * TOTALWIDTH, index * WIDTH + 2 * TOTALWIDTH + WIDTH);
		return OCRDigits.convert(top + middle + bottom);
	}
	
	Boolean hasValidCheckSum(String accountNumber) {		
		char[] characters = accountNumber.toCharArray();
		int checkSum = 0;
		for(int pos = 1; pos <= DIGITS; pos++) {
			checkSum += Character.digit(characters[DIGITS - pos], 10) * pos;			
		}
		return (checkSum % 11 == 0);
	}
}
