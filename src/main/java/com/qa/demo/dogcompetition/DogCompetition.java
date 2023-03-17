package com.qa.demo.dogcompetition;

public class DogCompetition {

	public String listPlaces(int place) {
		String s = "";
		int lastDigit = -1;
		for (int i = 1; i <= 100; i++) {
			if (i != place) {
				lastDigit = i % 10;
				// if ends in 1 - add "st"
				if (lastDigit == 1) {
					s += i + "st";
				}
				// if ends in 2 - add "nd"
				else if (lastDigit == 2) {
					s += i + "nd";
				}
				// if ends in 3 - add "rd"
				else if (lastDigit == 3) {
					s += i + "rd";
				}
				// if not 100th number AND not on 99 and placed 100th - add comma space
				if (i != 100 && !(i == 99 && place == 100)) {
					s += ", ";
				}
			}
		}
		return s;
	}

}
