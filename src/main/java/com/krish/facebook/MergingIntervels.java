package com.krish.facebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

//https://www.geeksforgeeks.org/merging-intervals/
public class MergingIntervels {

	//Refer com.krish.iq.MergeIntervals
	public static void main(String[] args) {
		
		List<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(6, 8));
		intervals.add(new Interval(1, 9));
		intervals.add(new Interval(2, 4));
		intervals.add(new Interval(4, 7));

		mergingIntervels1(intervals);
		
		int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
		mergingIntervals2(intervals1);
	}
	

	public static void mergingIntervals2(int[][] intervals) {
		if(null == intervals || intervals.length <= 1)
			return;
		
		Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
		
		List<int[]> result = new ArrayList<>();
		
		int[] previousInterval = intervals[0];
		result.add(previousInterval);
		
		for(int[] interval : intervals) {
			if(interval[0] <= previousInterval[1]) {
				previousInterval[1] = Math.max(previousInterval[1], interval[1]);
			} else {
				previousInterval = interval;
				result.add(previousInterval);
			}
		}
		
		//System.out.println(result);
		print(result);
	}
	

	public static void print(List<int[]> values) {

		for(int[] value : values) {
			System.out.print("[");
			for(int i = 0; i < value.length; i++) {
				System.out.print(value[i]);
				if(i + 1 < value.length)
					System.out.print(", ");
			}
			System.out.print("]");
		}
		System.out.println();
	}
	
	//Refer com.krish.iq.MergeIntervals
	public static void mergingIntervels1(List<Interval> intervals) {
		if(intervals.isEmpty())
			return;
		
		Stack<Interval> stack = new Stack<>();
		
		Collections.sort(intervals, (i1, i2) -> i1.getStart() - i2.getStart());
		
		stack.push(intervals.get(0));
		
		for(int i = 1; i < intervals.size(); i++) {
			Interval top = stack.peek();
			
			Interval interval = intervals.get(i);
			if(top.getEnd() < interval.getStart()) {
				stack.push(interval);
			} else if (top.getEnd() < interval.getEnd()) {
				top.setEnd(interval.getEnd());
				stack.pop();
				stack.push(top);
			}
		}
		
		while(!stack.isEmpty()) {
			Interval interval = stack.pop();
			
			System.out.println("[" + interval.getStart() + ", " + interval.getEnd() + "]");
		}
		
	}

}

class Interval {
	
	private int start;
	private int end;
	
	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
	
}