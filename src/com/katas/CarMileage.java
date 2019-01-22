package com.katas;

public class CarMileage {

	public static final int NOT_INTERESTING = 0;
	public static final int INTERESTING = 2;

	public static int isInteresting(int number, int[] awesomePhrases) {
		if (number < 100) {
			return NOT_INTERESTING;
		}
		String mileage = String.valueOf(number);
		if (isAnyDigitFollowedByAllZeros(mileage)) {
			return INTERESTING;
		}
		if (isEveryDigitIsSame(mileage)) {
			return INTERESTING;
		}
		if (isSequentialIncrementing(mileage)) {
			return INTERESTING;
		}
		return NOT_INTERESTING;
	}

	private static boolean isSequentialIncrementing(String mileage) {
		for (int i = 1; i < mileage.length(); i++) {
			if (mileage.charAt(i - 1) + 1 != (int)mileage.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isEveryDigitIsSame(String mileage) {
		for (int i = 1; i < mileage.length(); i++) {
			if (mileage.charAt(i - 1) != mileage.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isAnyDigitFollowedByAllZeros(String mileage) {
		for (int i = 1; i < mileage.length(); i++) {
			if (mileage.charAt(i) != '0') {
				return false;
			}
		}
		return true;
	}

}
