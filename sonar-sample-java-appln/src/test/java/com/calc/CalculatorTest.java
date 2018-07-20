package com.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;

	@Before
	public void setup() {
		calculator = new Calculator();
	}

	@Test
	public void add() {
		assertEquals(25, calculator.add(12, 13));
	}

	@Test
	public void sub() {
		assertEquals(-1, calculator.add(12, 13));
	}

}
