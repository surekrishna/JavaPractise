package com.krish.iq;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://dev.to/rohithv07/jumping-numbers-44ob
//https://www.geeksforgeeks.org/java-program-for-minimum-number-of-jumps-to-reach-end/
//https://www.javatpoint.com/jumping-number-in-java
public class JumpingNumberNearAndBelowOrEqual {

	public static void main(String[] args) {

		System.out.println(getJumpingNumberLessThanEqualToNumber(50));
		System.out.println(getJumpingNumberLessThanEqualToNumber(400));
		System.out.println(getJumpingNumberLessThanEqualToNumber(10));
		System.out.println(getJumpingNumberLessThanEqualToNumber(123439));
		
		//bfs
		
		System.out.println(getJumpingNumberLessThanEqualToNumberUsingBFS(46));
		System.out.println(getJumpingNumberLessThanEqualToNumberUsingBFS(368));
		System.out.println(getJumpingNumberLessThanEqualToNumberUsingBFS(8765));
		
	}
	
	public static int getJumpingNumberLessThanEqualToNumber(int number) {
		for(int i = number; i >= 0; i--) {
			if(JumpingNumberOrNot.isJumpingNumber(i)) {
				return i;
			}
				
		}
		
		return -1;
	}
	
	
	//using bfs
	public static long getJumpingNumberLessThanEqualToNumberUsingBFS(long number) {
		if (number <= 10)
            return number;
        List<Integer> results = new ArrayList<>();
        for (int i=0; i<10 && i <= number; i++) {
            bfs(number, i, results);
        }
        int max = Integer.MIN_VALUE;
        for (int num : results) {
            max = Math.max(num, max);
        }
        return max;
	}
	
	static void bfs(long n, int i, List<Integer> results) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        while (!queue.isEmpty()) {
            i = queue.poll();
            if (i <= n) {
                results.add(i);
                int lastDigit = i % 10;
                if (lastDigit == 0) {
                    queue.add((i * 10) + (lastDigit + 1));
                }
                else if (lastDigit == 9) {
                    queue.add((i * 10) + (lastDigit - 1));
                }
                else {
                    queue.add((i * 10) + (lastDigit + 1));
                    queue.add((i * 10) + (lastDigit - 1));
                }
            }
        }
    }

}
