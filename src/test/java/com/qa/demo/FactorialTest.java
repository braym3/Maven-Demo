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

	@Test
	void challengeInput1() {
		assertEquals("3628800 = 10!", this.fact.reverseFactorial(3628800));
	}

	@Test
	void challengeInput2() {
		assertEquals("479001600 = 12!", this.fact.reverseFactorial(479001600));
	}

	@Test
	void challengeInput3() {
		assertEquals("6 = 3!", this.fact.reverseFactorial(6));
	}

	@Test
	void challengeInput4() {
		assertEquals("NONE", this.fact.reverseFactorial(18));
	}
}
