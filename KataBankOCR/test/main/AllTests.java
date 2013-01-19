package main;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AccountNumberParserTest.class, OCRDigitsTest.class, KataBankOCRTest.class })
public class AllTests {

}
