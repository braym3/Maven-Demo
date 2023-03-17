package com.qa.demo;

public class Factorial {

	public String reverseFactorial(int n) {
		int reverse = n;
		int divider;
		for (divider = 2; reverse > divider; divider++) {
			reverse = reverse / divider;
		}
		if (reverse == divider) {
			return n + " = " + reverse + "!";
		} else {
			return "NONE";
		}
	}
}
