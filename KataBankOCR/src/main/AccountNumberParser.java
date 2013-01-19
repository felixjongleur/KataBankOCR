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
		return digits;
	}

	String convertDigitAtIndex(int index, String accountNumber) {
		String top    = accountNumber.substring(index * WIDTH, index * WIDTH + WIDTH);
		String middle = accountNumber.substring(index * WIDTH + TOTALWIDTH, index * WIDTH + TOTALWIDTH + WIDTH);
		String bottom = accountNumber.substring(index * WIDTH + 2 * TOTALWIDTH, index * WIDTH + 2 * TOTALWIDTH + WIDTH);
		return OCRDigits.convert(top + middle + bottom);
	}
}
