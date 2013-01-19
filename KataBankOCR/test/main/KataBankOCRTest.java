package main;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;

public class KataBankOCRTest {

	@Test
	public void testGetNextAccount() throws Exception {
		KataBankOCR ocr = new KataBankOCR(new File("/test/resources/123456789.txt"));
		assertEquals("123456789", ocr.getNextAccount());
	}
}
