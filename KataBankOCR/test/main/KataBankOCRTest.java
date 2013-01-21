package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KataBankOCRTest {
	
	@Test
	public void testGetNextAccount_UseCase1And2() throws Exception {
		KataBankOCR ocr = new KataBankOCR("/test/main/resources/useCase1.txt");
		assertEquals("000000000", ocr.getNextAccount());
		assertEquals("123456789", ocr.getNextAccount());
	}
	
	@Test
	public void testGetNextAccount_UseCase3() throws Exception {
		KataBankOCR ocr = new KataBankOCR("/test/main/resources/useCase3.txt");
		assertEquals("111111111 ERR", ocr.getNextAccount());
		assertEquals("222222222 ERR", ocr.getNextAccount());
		assertEquals("000000051", ocr.getNextAccount());
		assertEquals("49006771? ILL", ocr.getNextAccount());
		assertEquals("1234?678? ILL", ocr.getNextAccount());
	}
}
