package com.katas;

import java.util.stream.IntStream;

public class CarMileage {

	public static final int NOT_INTERESTING = 0;
	public static final int INTERESTING = 2;
	public static final int ALMOST_INTERESTING = 1;

	public static int isInteresting(int number, int[] awesomePhrases) {
		if (number == 99) {
			return ALMOST_INTERESTING;
		}
		if (number < 100) {
			return NOT_INTERESTING;
		}
		if (isInterestingNumber(number, awesomePhrases)) {
			return INTERESTING;
		}
		if (isInterestingNumber(number + 1, awesomePhrases)) {
			return ALMOST_INTERESTING;
		}
		return NOT_INTERESTING;
	}

	private static boolean isInterestingNumber(int number, int[] awesomePhrases) {
		String mileage = String.valueOf(number);
		return isAnyDigitFollowedByAllZeros(mileage)
				|| isEveryDigitIsSame(mileage)
				|| isSequentialIncrementing(mileage)
				|| isSequentialDecrementing(mileage)
				|| isPalindromeNumber(mileage)
				|| isAwesomePhrase(number, awesomePhrases);
	}

	private static boolean isAwesomePhrase(int number, int[] awesomePhrases) {
		return IntStream.of(awesomePhrases).anyMatch(n -> n == number);
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
