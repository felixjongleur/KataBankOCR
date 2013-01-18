package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class OCRDigitsTest {

	@Test
	public void testDigitConverter_Zero() throws Exception {		
		assertEquals(0, new OCRDigits().convert(OCRDigits.ZERO));
	}
	
	@Test
	public void testDigitConverter_One() throws Exception {
		assertEquals(1, new OCRDigits().convert(OCRDigits.ONE));
	}
	
	@Test
	public void testDigitConverter_Nine() throws Exception {
		assertEquals(9, new OCRDigits().convert(OCRDigits.NINE));
	}
}
