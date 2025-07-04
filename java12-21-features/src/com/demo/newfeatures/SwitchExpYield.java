package com.demo.newfeatures;

public class SwitchExpYield {

	public static void main(String[] args) {

		Day day = Day.WEDNESDAY;

		int numLetters = switch (day) {
		case MONDAY, FRIDAY, SUNDAY:
			System.out.println("The Value : " + 6);
			yield 6;
		case TUESDAY:
			System.out.println("The Value : " + 7);
			yield 7;
		case THURSDAY, SATURDAY:
			System.out.println("The Value : " + 8);
			yield 8;

		case WEDNESDAY:
			System.out.println("The Value : " + 9);
			yield 9;
		default:
			yield 0;
		};
		System.out.println(numLetters);
	}
}
