package com.katas;

public class CarMileage {

	public static final int NOT_INTERESTING = 0;
	public static final int INTERESTING = 2;

	public static int isInteresting(int number, int[] awesomePhrases) {
		String mileage = String.valueOf(number);
		if (number >= 100 && isAnyDigitFollowedByAllZeros(mileage)) {
			return INTERESTING;
		}
		boolean isEveryDigitIsSame = true;
		for (int i = 1; i < mileage.length(); i++) {
			if (mileage.charAt(i - 1) != mileage.charAt(i)) {
				isEveryDigitIsSame = false;
			}
		}
		if (number >= 100 && isEveryDigitIsSame) {
			return INTERESTING;
		}
		return NOT_INTERESTING;
	}

	private static boolean isEveryDigitIsSame(String mileage) {
		return false;
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
