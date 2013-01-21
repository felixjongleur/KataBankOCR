package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class KataBankOCR {

	private BufferedReader ocrReader;
	
	KataBankOCR(String fileName) throws FileNotFoundException {
		ocrReader = new BufferedReader(new FileReader(new File(System.getProperty("user.dir") + fileName)));
	}
	
	String getNextAccount() throws IOException {
		String line1 = ocrReader.readLine();
		String line2 = ocrReader.readLine();
		String line3 = ocrReader.readLine();
		String line4 = ocrReader.readLine();		
		return new AccountNumberParser().convertAccountNumber(line1 + line2 + line3);
	}
}
