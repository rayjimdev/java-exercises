package com.ni.exercises.medium;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * In computer science, a double-ended queue (dequeue, often abbreviated to deque,
 * pronounced deck) is an abstract data type that generalizes a queue, for which
 * elements can be added to or removed from either the front (head) or back (tail).<br>
 * <br>
 * Deque interfaces can be implemented using various types of collections such as<br>
 * LinkedList or ArrayDeque classes. For example, deque can be declared as:<br>
 * <br>
 * Deque deque = new LinkedList<>();<br>
 * or<br>
 * Deque deque = new ArrayDeque<>();<br>
 * <br>
 * In this problem, you are given N integers. You need to find the maximum number of<br>
 * unique integers among all the possible contiguous subarrays of size M.<br>
 * <br>
 * Note: Time limit is 3 second for this problem.<br>
 * <br>
 * Input Format<br>
 * <br>
 * The first line of input contains two integers N and M: representing the total<br>
 * number of integers in the array and the size of the subarray, respectively. The<br>
 * next line contains N space separated integers.<br>
 * <br>
 * Constraints<br>
 * 1 <= N <= 100000<br>
 * 1 <= M <= 100000<br>
 * M <= N<br>
 * <br>
 * The numbers in the array will range between [0, 10000000].<br>
 * <br>
 * Output Format<br>
 * <br>
 * Print the maximum number of unique integers among all possible contiguous<br>
 * subarrays of size M.<br>
 * <br>
 * Sample Input<br>
 * <br>
 * 6 3<br>
 * 5 3 5 2 3 2<br>
 * <br>
 * Sample Output<br>
 * <br>
 * 3<br>
 * <br>
 * Explanation<br>
 * <br>
 * In the sample testcase, there are 4 subarrays of contiguous numbers.<br>
 * <br>
 * s1 = <5, 3, 5> - Has 2 unique numbers.<br>
 * s1 = <3, 5, 2> - Has 3 unique numbers.<br>
 * s1 = <5, 2, 3> - Has 3 unique numbers.<br>
 * s1 = <2, 3, 2> - Has 2 unique numbers.<br>
 * <br>
 * In these subarrays, there are 2, 3, 3, 2 unique numbers, respectively. The<br>
 * maximum amount of unique numbers among all possible contiguous subarrays is 3.<br>
 * <br>
 * <br>
 * @author Raymundo Jimenez
 *
 */

public class DoubleDequeue {
	
	/**
	 * Solution method
	 * @param deque
	 * @return The maximum amount of unique numbers in all possible subarrays.
	 */
	public int maxUniqueNumberInSubarray(Deque deque, int m) {
		int total = deque.size();
		return total;
	}
	
	

	public static void main(String[] args) {
		Deque deque = new ArrayDeque<>(List.of(5, 3, 5, 2, 3, 2));
		int n = deque.size();
		int m = 3;
		System.out.println("Try a solution in 'solutions' package.");
	}

}
