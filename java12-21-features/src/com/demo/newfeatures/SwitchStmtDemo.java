package com.demo.newfeatures;

public class SwitchStmtDemo {

	public static void main(String[] args) {

		Day day = Day.WEDNESDAY;

		int numLetters = switch (day) {
		case MONDAY, FRIDAY, SUNDAY -> 6; // case->L
		case TUESDAY -> 7;
		case THURSDAY, SATURDAY -> 8;

		case WEDNESDAY -> 9;

		default -> throw new IllegalStateException("Wrong value provided " + day);
		};
		System.out.println(numLetters);
	}
}
