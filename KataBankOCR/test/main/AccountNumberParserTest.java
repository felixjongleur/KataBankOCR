package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountNumberParserTest {

	@Test
	public void testAccountNumberParser_Zeros() throws Exception {
		
		String accountNumber = " _  _  _  _  _  _  _  _  _ " +
							   "| || || || || || || || || |" +
							   "|_||_||_||_||_||_||_||_||_|";
		assertEquals("000000000", new AccountNumberParser().convertAccountNumber(accountNumber));
	}

	@Test
	public void testAccountNumberParser_Ones() throws Exception {
		
		String accountNumber = "                           " +
							   "  |  |  |  |  |  |  |  |  |" +
							   "  |  |  |  |  |  |  |  |  |";
		assertEquals("111111111", new AccountNumberParser().convertAccountNumber(accountNumber));
	}

	@Test
	public void testAccountNumberParser_Random() throws Exception {
		
		String accountNumber = "    _  _     _  _  _  _  _ " +
							   "  | _| _||_||_ |_   ||_||_|" +
							   "  ||_  _|  | _||_|  ||_| _|";
		assertEquals("123456789", new AccountNumberParser().convertAccountNumber(accountNumber));
	}
	
	
}
