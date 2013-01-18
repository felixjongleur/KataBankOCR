package main;

import java.util.HashMap;
import java.util.Map;

public class OCRDigits {
	
	private final Map<String, Integer> ocrToDigits;
	
	public OCRDigits() {
		ocrToDigits = new HashMap<String, Integer>();
		ocrToDigits.put(ZERO , 0);
		ocrToDigits.put(ONE  , 1);
		ocrToDigits.put(TWO  , 2);
		ocrToDigits.put(THREE, 3);
		ocrToDigits.put(FOUR , 4);
		ocrToDigits.put(FIVE , 5);
		ocrToDigits.put(SIX  , 6);
		ocrToDigits.put(SEVEN, 7);
		ocrToDigits.put(EIGHT, 8);
		ocrToDigits.put(NINE , 9);
	}
	
	public int convert(String digit) {
		return ocrToDigits.get(digit);
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
