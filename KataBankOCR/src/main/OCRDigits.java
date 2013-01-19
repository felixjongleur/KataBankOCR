package main;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OCRDigits {
	
	static Map<String, String> ocrToDigits;
		
	static String convert(String digit) {
		if(ocrToDigits == null) {
			populateOCRToDigits();
		}
		return ocrToDigits.get(digit);
	}
	
	private static void populateOCRToDigits() {
		Map<String, String> temp = new HashMap<String, String>();
		temp.put(ZERO , "0");
		temp.put(ONE  , "1");
		temp.put(TWO  , "2");
		temp.put(THREE, "3");
		temp.put(FOUR , "4");
		temp.put(FIVE , "5");
		temp.put(SIX  , "6");
		temp.put(SEVEN, "7");
		temp.put(EIGHT, "8");
		temp.put(NINE , "9");
		ocrToDigits = Collections.unmodifiableMap(temp);
	}

	static final String ZERO  = " _ " +
							    "| |" +
							    "|_|";

	static final String ONE   = "   " +
							    "  |" +
							    "  |";

	static final String TWO   = " _ " +
							    " _|" +
							    "|_ ";

	static final String THREE = " _ " +
							    " _|" +
							    " _|";

	static final String FOUR  = "   " +
							    "|_|" +
							    "  |";

	static final String FIVE  = " _ " +
							    "|_ " +
							    " _|";

	static final String SIX   = " _ " +
							    "|_ " +
							    "|_|";

	static final String SEVEN = " _ " +
							    "  |" +
							    "  |";

	static final String EIGHT = " _ " +
							    "|_|" +
							    "|_|";

	static final String NINE  = " _ " +
							    "|_|" +
							    " _|";
}
