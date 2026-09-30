package com.ni.exercises.medium.solutions;

import java.util.Deque;
import java.util.List;

import com.ni.exercises.medium.DoubleDequeue;

public class DoubleDequeue_s1 extends DoubleDequeue {
	@Override
	public int maxUniqueNumberInSubarray(Deque<Integer> deque, int m) {
		List<Integer> list = deque.stream().toList();
		int maxFound = 0;
		if (m > list.size()) {
			maxFound = 0;
		} else if (m == list.size()) {
			maxFound = (int) list.stream().distinct().count();
		} else {
			for (int i= 0; i < list.size() - m; i++) {
				List<Integer> sublist = list.subList(i, i + m);
				int differentInts = (int) sublist.stream().distinct().count();
				if (maxFound < differentInts) {
					maxFound = differentInts;
				}
			}
		}
		return maxFound;
	}
}
