package com.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarMileageTest {

	@Test
	public void should_return_0_given_mileage_less_than_100() {
		assertEquals(0, CarMileage.isInteresting(99, new int[]{256}));
	}
}
