package ch.bbw.consolecalculator;

import static org.junit.Assert.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * Test Class for Class Calculator
 * @author Peter Rutschmann
 * @version 0.0.1
 */
public class CalculatorTest {

	Calculator testee;

	@Test
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 25) == 35);
	}

	@Test
	public void testSubtractionZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.subtraktion(25, 10) == 15);
	}

	//no exception expected, otherwise test has an error
	@Test
	public void testDivisionZweiPositiveIsOk() throws java.lang.ArithmeticException {
		testee = new Calculator();
		assertTrue(testee.division(10, 2) == 5);
	}
}
