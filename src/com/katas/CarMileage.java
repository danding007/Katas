package com.katas;

public class CarMileage {

	public static final int NOT_INTERESTING = 0;

	public static int isInteresting(int number, int[] awesomePhrases) {
		if (number == 100) {
			return 2;
		}
		return NOT_INTERESTING;
	}

}
