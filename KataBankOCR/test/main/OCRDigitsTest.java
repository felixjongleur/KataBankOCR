package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OCRDigitsTest {
	
	@Test
	public void testDigitConverter_Zero() throws Exception {		
		assertEquals("0", OCRDigits.convert(OCRDigits.ZERO));
	}
	
	@Test
	public void testDigitConverter_One() throws Exception {
		assertEquals("1", OCRDigits.convert(OCRDigits.ONE));
	}
	
	@Test
	public void testDigitConverter_Two() throws Exception {
		assertEquals("2", OCRDigits.convert(OCRDigits.TWO));
	}
	
	@Test
	public void testDigitConverter_Three() throws Exception {
		assertEquals("3", OCRDigits.convert(OCRDigits.THREE));
	}
	
	@Test
	public void testDigitConverter_Four() throws Exception {
		assertEquals("4", OCRDigits.convert(OCRDigits.FOUR));
	}
	
	@Test
	public void testDigitConverter_Five() throws Exception {
		assertEquals("5", OCRDigits.convert(OCRDigits.FIVE));
	}
	
	@Test
	public void testDigitConverter_Six() throws Exception {
		assertEquals("6", OCRDigits.convert(OCRDigits.SIX));
	}
	
	@Test
	public void testDigitConverter_Seven() throws Exception {
		assertEquals("7", OCRDigits.convert(OCRDigits.SEVEN));
	}
	
	@Test
	public void testDigitConverter_Eight() throws Exception {
		assertEquals("8", OCRDigits.convert(OCRDigits.EIGHT));
	}
	
	@Test
	public void testDigitConverter_Nine() throws Exception {
		assertEquals("9", OCRDigits.convert(OCRDigits.NINE));
	}
}
