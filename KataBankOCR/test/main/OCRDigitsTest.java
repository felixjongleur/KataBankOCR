package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class OCRDigitsTest {

	@Test
	public void testDigitConverter_Zero() throws Exception {
		assertEquals(0, new OCRDigits().convert("temp"));
	}
}
