package com.ni.exercises.medium.solutions;

import java.util.Deque;
import java.util.List;
import java.util.Map;

import com.ni.exercises.medium.DoubleDequeue;

public class DoubleDequeue_s1 extends DoubleDequeue {
	@Override
	public int maxUniqueNumberInSubarray(Deque deque, int m) {
		if (m > deque.size()) {
			return 0;
		}
		Map<Integer, List<Integer>> subArrays = null;
		int maxFound = deque.size();
		return maxFound;
	}
}
