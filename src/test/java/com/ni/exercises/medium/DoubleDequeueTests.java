package com.ni.exercises.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ni.exercises.medium.solutions.DoubleDequeue_s1;

public class DoubleDequeueTests {
	// ADD YOUR SOLUTION SUBCLASS
	DoubleDequeue doubleDequeue;
	DoubleDequeue_s1 doubleDeque_s1;
	
	// TEST CASES VALUES (DO NOT MODIFY)
	Deque<Integer> deque1, deque2, deque3, deque4, deque5, deque6, deque7,
		deque8, deque9, deque10, deque11, deque12, deque13, deque14, deque15,
		deque16, deque17, deque18, deque19, deque20;
	int n1, m1, output1, n2, m2, output2, n3, m3, output3, n4, m4, output4,
		n5, m5, output5, n6, m6, output6, n7, m7, output7, n8, m8, output8,
		n9, m9, output9, n10, m10, output10, n11, m11, output11,
		n12, m12, output12, n13, m13, output13, n14, m14, output14,
		n15, m15, output15, n16, m16, output16, n17, m17, output17,
		n18, m18, output18, n19, m19, output19, n20, m20, output20;
	
	@BeforeEach
	void setUp() throws Exception {
		// Add your solution subclass instance
		doubleDequeue = new DoubleDequeue();
		doubleDeque_s1 = new DoubleDequeue_s1();
		
		// CASE 1
		deque1 = new ArrayDeque<>(List.of(5, 3, 5, 2, 3, 2));
		n1 = deque1.size();
		m1 = 3;
		output1 = 3;
		
		// CASE 2
		deque2 = new ArrayDeque<>(List.of(42));
		n2 = deque2.size();
		m2 = 1;
		output2 = 1;
		
		// CASE 3
		deque3 = new ArrayDeque<>(List.of(5, 5, 3, 8, 8, 2, 9));
		n3 = deque3.size();
		m3 = 1;
		output3 = 1;
		
		// CASE 4
		deque4 = new ArrayDeque<>(List.of(7, 7, 7, 7, 7, 7, 7, 7));
		n4 = deque4.size();
		m4 = 4;
		output4 = 1;
		
		// CASE 5
		deque5 = new ArrayDeque<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
		n5 = deque5.size();
		m5 = 4;
		output5 = 4;
		
		// CASE 6
		deque6 = new ArrayDeque<>(List.of(1, 2, 1, 3, 4, 2, 5, 3, 6, 4));
		n6 = deque6.size();
		m6 = 10;
		output6 = 6;
		
		// CASE 7
		deque7 = new ArrayDeque<>(List.of(1, 2, 1, 2, 1, 2, 1, 2, 1, 2));
		n7 = deque7.size();
		m7 = 5;
		output7 = 2;
		
		// CASE 8
		deque8 = new ArrayDeque<>(List.of(1, 1, 2, 2, 3, 4, 5, 5, 5));
		n8 = deque8.size();
		m8 = 4;
		output8 = 4;
		
		// CASE 9
		deque9 = new ArrayDeque<>(List.of(1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5));
		n9 = deque9.size();
		m9 = 5;
		output9 = 3;
		
		// CASE 10
		deque10 = new ArrayDeque<>(List.of(0, 10000000, 0, 10000000, 5, 9999999, 10000000));
		n10 = deque10.size();
		m10 = 3;
		output10 = 3;
		
		// CASE 11
		deque11 = new ArrayDeque<>(List.of(1, 2, 3, 4, 4, 4, 4, 5, 5, 5));
		n11 = deque11.size();
		m11 = 4;
		output11 = 4;
		
		// CASE 12
		deque12 = new ArrayDeque<>(List.of(1, 1, 1, 2, 2, 3, 4, 5, 6, 7));
		n12 = deque12.size();
		m12 = 4;
		output12 = 4;
		
		// CASE 13
		deque13 = new ArrayDeque<>(List.of(1, 2, 2, 3, 3, 4, 4, 5, 5, 6));
		n13 = deque13.size();
		m13 = 5;
		output13 = 3;
		
		// CASE 14
		deque14 = new ArrayDeque<>(List.of(1, 2, 3, 1, 2, 4, 5));
		n14 = deque14.size();
		m14 = 3;
		output14 = 3;
		
		// CASE 15
		deque15 = new ArrayDeque<>(List.of(1, 1, 1, 1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 6, 6));
		n15 = deque15.size();
		m15 = 6;
		output15 = 5;
		
		// CASE 16
		deque16 = new ArrayDeque<>(List.of(4, 4, 2, 2, 4, 4, 2, 2, 4, 4));
		n16 = deque16.size();
		m16 = 10;
		output16 = 2;
		
		// CASE 17
		deque17 = new ArrayDeque<>(List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5));
		n17 = deque17.size();
		m17 = 2;
		output17 = 2;
		
		// CASE 18
		deque18 = new ArrayDeque<>(List.of(0, 0, 1, 0, 2, 0, 3, 0, 4, 0));
		n18 = deque18.size();
		m18 = 5;
		output18 = 4;
		
		// CASE 19
		deque19 = new ArrayDeque<>(List.of(10, 20, 10, 30, 20));
		n19 = deque19.size();
		m19 = 5;
		output19 = 3;
		
		// CASE 20
		deque20 = new ArrayDeque<>(List.of(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 11, 12, 13, 14, 15));
		n20 = deque20.size();
		m20 = 10;
		output20 = 10;
	}

	/**
	 * Example of adding test cases
	 */
	@Test
	@DisplayName("Main problem class")
	void maxUniqueNumberInSubarrayTest() {
		// Example of test case 1
		int currentValue = doubleDequeue.maxUniqueNumberInSubarray(deque1, m1);
		assertEquals(output1, currentValue);
	}
	
	/**
	 * Verifying test cases for Solution1:
	 * DoubleDequeue_s1
	 */
	@Test
	@DisplayName("Solution 1")
	void maxUniqueNumberInSubarrayTest_S1() {
		// *** VERIFICATION
		// test case 1
		int currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque1, m1);
		assertEquals(output1, currentValue);
		
		// test case 2
		currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque2, m2);
		assertEquals(output2, currentValue);
		
		// test case 3
		currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque3, m3);
		assertEquals(output3, currentValue);
		
		// test case 4
		currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque4, m4);
		assertEquals(output4, currentValue);
		
		// test case 5
		currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque5, m5);
		assertEquals(output5, currentValue);
		
		// test case 6
		currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque6, m6);
		assertEquals(output6, currentValue);
		
		// test case 7
		currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque7, m7);
		assertEquals(output7, currentValue);
		
		// test case 8
		currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque8, m8);
		assertEquals(output8, currentValue);
		
		// test case 9
		currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque9, m9);
		assertEquals(output9, currentValue);
		
		// test case 10
		currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque10, m10);
		assertEquals(output10, currentValue);
		
		// test case 11
		currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque11, m11);
		assertEquals(output11, currentValue);
		
		// test case 12
		currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque12, m12);
		assertEquals(output12, currentValue);
		
		// test case 13
		currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque13, m13);
		assertEquals(output13, currentValue);
		
		// test case 14
		currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque14, m14);
		assertEquals(output14, currentValue);
		
		// test case 15
		currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque15, m15);
		assertEquals(output15, currentValue);
		
		// test case 16
		currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque16, m16);
		assertEquals(output16, currentValue);
		
		// test case 17
		currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque17, m17);
		assertEquals(output17, currentValue);
		
		// test case 18
		currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque18, m18);
		assertEquals(output18, currentValue);
		
		// test case 19
		currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque19, m19);
		assertEquals(output19, currentValue);
		
		// test case 20
		currentValue = doubleDeque_s1.maxUniqueNumberInSubarray(deque20, m20);
		assertEquals(output20, currentValue);
	}
}