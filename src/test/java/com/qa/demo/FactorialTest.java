package com.qa.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FactorialTest {
	private Factorial fact = new Factorial();

	@Test
	void testReverseFactorial() {
		assertEquals("120 = 5!", this.fact.reverseFactorial(120));
	}

	@Test
	void testNoneFactorial() {
		assertEquals("NONE", this.fact.reverseFactorial(150));
	}
}
