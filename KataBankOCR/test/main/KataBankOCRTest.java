package main;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;

public class KataBankOCRTest {
	
	@Test
	public void testGetNextAccount_MultipleRows() throws Exception {
		KataBankOCR ocr = new KataBankOCR("/test/main/resources/multipleAccounts.txt");
		assertEquals("123456789", ocr.getNextAccount());
		assertEquals("111111111", ocr.getNextAccount());
		assertEquals("664371495 ERR", ocr.getNextAccount());
	}
}
