package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class OCRDigitsTest {

	@Test
	public void testDigitConverter_Zero() throws Exception {
		String digit = " _ " +
					   "| |" +
					   "|_|" +
					   "   ";
		
		assertEquals(0, new OCRDigits().convert(digit));
	}
	
	@Test
	public void testDigitConverter_One() throws Exception {
		String digit = "   " +
					   "  |" +
					   "  |" +
					   "   ";
		assertEquals(1, new OCRDigits().convert(digit));
	}
	
	@Test
	public void testDigitConverter_Nine() throws Exception {
		String digit = " _ " +
					   "|_|" +
					   "  |" +
					   "   ";
		assertEquals(9, new OCRDigits().convert(digit));
	}
}
