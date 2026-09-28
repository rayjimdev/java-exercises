package com.ni.exercises.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DoubleDequeueTests {
	DoubleDequeue doubleDequeue;
	Deque<Integer> deque1;
	int n1, m1, expected1;
	
	@BeforeEach
	void setUp() throws Exception {
		doubleDequeue = new DoubleDequeue();
		deque1 = new ArrayDeque<>(List.of(5, 3, 5, 2, 3, 2));
		int n1 = deque1.size();
		int m1 = 3;
		// This is not a solution; this is a WRONG result.
		expected1 = 6;
		System.out.println("n=" + n1 + ", m=" + m1);
	}
	
	@Test
	void maxUniqueNumberInSubarrayTest() {
		int currentValue = doubleDequeue.maxUniqueNumberInSubarray(deque1, m1);
		assertEquals(expected1, currentValue);
	}
}