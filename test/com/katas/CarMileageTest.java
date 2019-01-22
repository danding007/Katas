package com.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarMileageTest {

	@Test
	public void should_return_not_interesting_given_mileage_less_than_100() {
		assertEquals(0, CarMileage.isInteresting(99, new int[]{256}));
	}

	@Test
	public void should_return_interesting_given_mileage_is_100() {
		assertEquals(2, CarMileage.isInteresting(100, new int[]{256}));
	}
}
