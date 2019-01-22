package com.katas;

import java.util.stream.IntStream;

public class CarMileage {

	public static final int NOT_INTERESTING = 0;
	public static final int INTERESTING = 2;
	public static final int ALMOST_INTERESTING = 1;

	public static int isInteresting(int number, int[] awesomePhrases) {
		if (isInterestingNumber(number, awesomePhrases)) {
			return INTERESTING;
		}
		if (isInterestingNumber(number + 1, awesomePhrases) || isInterestingNumber(number + 2, awesomePhrases)) {
			return ALMOST_INTERESTING;
		}
		return NOT_INTERESTING;
	}

	private static boolean isInterestingNumber(int number, int[] awesomePhrases) {
		if (number < 100) {
			return false;
		}
		String mileage = String.valueOf(number);
		return isAnyDigitFollowedByAllZeros(mileage)
				|| isPalindromeNumber(mileage)
				|| isSequentialIncrementing(mileage)
				|| isSequentialDecrementing(mileage)
				|| isAwesomePhrase(number, awesomePhrases);
	}

	private static boolean isAwesomePhrase(int number, int[] awesomePhrases) {
		return IntStream.of(awesomePhrases).anyMatch(n -> n == number);
	}

	private static boolean isPalindromeNumber(String mileage) {
//		return new StringBuilder(mileage).reverse().toString().equals(mileage);
		for (int i = 0; i < mileage.length() / 2; i++) {
			if (mileage.charAt(i) != mileage.charAt(mileage.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isSequentialDecrementing(String mileage) {
		return "9876543210".contains(mileage);
	}

	private static boolean isSequentialIncrementing(String mileage) {
		return "1234567890".contains(mileage);
	}

	private static boolean isAnyDigitFollowedByAllZeros(String mileage) {
		return mileage.matches("\\d0+");
	}

}
