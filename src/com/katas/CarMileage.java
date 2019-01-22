package com.katas;

public class CarMileage {

	public static final int NOT_INTERESTING = 0;
	public static final int INTERESTING = 2;

	public static int isInteresting(int number, int[] awesomePhrases) {
		if (number < 100) {
			return NOT_INTERESTING;
		}
		String mileage = String.valueOf(number);
		boolean isInterestingNumber = isAnyDigitFollowedByAllZeros(mileage)
				|| isEveryDigitIsSame(mileage)
				|| isSequentialIncrementing(mileage)
				|| isSequentialDecrementing(mileage)
				||isPalindromeNumber(mileage);
		if (isInterestingNumber) {
			return INTERESTING;
		}
		return NOT_INTERESTING;
	}

	private static boolean isPalindromeNumber(String mileage) {
		for (int i = 0; i < mileage.length() / 2; i++) {
			if (mileage.charAt(i) != mileage.charAt(mileage.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isSequentialDecrementing(String mileage) {
		for (int i = 1; i < mileage.length(); i++) {
			if (mileage.charAt(i - 1) - 1 != mileage.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isSequentialIncrementing(String mileage) {
		for (int i = 1; i < mileage.length(); i++) {
			if (mileage.charAt(i - 1) + 1 != mileage.charAt(i)) {
				return i == mileage.length() - 1 && mileage.charAt(i - 1) == '9' && mileage.charAt(i) == '0';
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
