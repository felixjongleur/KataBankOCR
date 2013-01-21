package main;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;

public class KataBankOCRTest {

	@Test
	public void testGetNextAccount() throws Exception {
		KataBankOCR ocr = new KataBankOCR("/test/main/resources/123456789.txt");
		assertEquals("123456789", ocr.getNextAccount());
	}
	
	@Test
	public void testGetNextAccount2() throws Exception {
		KataBankOCR ocr = new KataBankOCR("/test/main/resources/111111111.txt");
		assertEquals("111111111", ocr.getNextAccount());
	}
}
