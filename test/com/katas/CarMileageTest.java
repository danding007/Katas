package com.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarMileageTest {

	@Test
	public void should_return_not_interesting_given_mileage_less_than_100() {
		assertEquals(0, CarMileage.isInteresting(55, new int[]{256}));
	}

	@Test
	public void should_return_interesting_given_mileage_is_100() {
		assertEquals(2, CarMileage.isInteresting(100, new int[]{256}));
	}

	@Test
	public void should_return_interesting_given_mileage_is_200() {
		assertEquals(2, CarMileage.isInteresting(200, new int[]{256}));
	}

	@Test
	public void should_return_interesting_given_all_digit_of_mileage_is_same() {
		assertEquals(2, CarMileage.isInteresting(111, new int[]{}));
	}

	@Test
	public void should_return_interesting_given_mileage_is_sequential_incrementing() {
		assertEquals(2, CarMileage.isInteresting(1234, new int[]{}));
	}

	@Test
	public void should_return_interesting_given_mileage_is_end_with_0_and_sequential_incrementing() {
		assertEquals(2, CarMileage.isInteresting(7890, new int[]{}));
	}


	@Test
	public void should_return_interesting_given_mileage_is_sequential_decrementing() {
		assertEquals(2, CarMileage.isInteresting(3210, new int[]{}));
	}

	@Test
	public void should_return_interesting_given_mileage_is_palindrome() {
		assertEquals(2, CarMileage.isInteresting(11211, new int[]{}));
	}

	@Test
	public void should_return_interesting_given_mileage_is_awesome_phrase() {
		assertEquals(2, CarMileage.isInteresting(1314, new int[]{256, 1314}));
	}

	@Test
	public void should_return_almost_interesting_given_the_next_mileage_is_interesting() {
		assertEquals(1, CarMileage.isInteresting(1313, new int[]{256, 1314}));
	}

	@Test
	public void should_return_almost_interesting_given_the_mileage_is_99() {
		assertEquals(1, CarMileage.isInteresting(99, new int[]{256, 1314}));
	}

	@Test
	public void should_return_almost_interesting_given_the_next_next_mileage_is_interesting() {
		assertEquals(1, CarMileage.isInteresting(1312, new int[]{256, 1314}));
	}



}
