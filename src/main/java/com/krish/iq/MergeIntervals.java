package com.krish.iq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.educative.io/m/merge-overlapping-intervals
public class MergeIntervals {

	public static void main(String[] args) {
		ArrayList<Pair> v = new ArrayList<>();

		v.add(new Pair(1, 5));
		v.add(new Pair(3, 7));
		v.add(new Pair(4, 6));
		v.add(new Pair(6, 8));
		v.add(new Pair(10, 12));
		v.add(new Pair(11, 15));

		ArrayList<Pair> result = mergeIntervals(v);
		for (Pair p : result)
			System.out.print(String.format("[%d, %d] ", p.first, p.second));

		System.out.println("\n\n");
		int[][] intervals1 = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		mergingIntervals2(intervals1);

	}

	public static void mergingIntervals2(int[][] intervals) {
		if (null == intervals || intervals.length <= 1)
			return;

		Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

		List<int[]> result = new ArrayList<>();

		int[] previousInterval = intervals[0];
		result.add(previousInterval);

		for (int[] interval : intervals) {
			if (interval[0] <= previousInterval[1]) {
				previousInterval[1] = Math.max(previousInterval[1], interval[1]);
			} else {
				previousInterval = interval;
				result.add(previousInterval);
			}
		}

		// System.out.println(result);
		print(result);
	}

	public static void print(List<int[]> values) {

		for (int[] value : values) {
			System.out.print("[");
			for (int i = 0; i < value.length; i++) {
				System.out.print(value[i]);
				if (i + 1 < value.length)
					System.out.print(", ");
			}
			System.out.print("]");
		}
		System.out.println();
	}

	static ArrayList<Pair> mergeIntervals(ArrayList<Pair> v) {
		if (v == null || v.isEmpty())
			return null;

		ArrayList<Pair> result = new ArrayList<>();
		result.add(new Pair(v.get(0).first, v.get(0).second));

		for (int i = 1; i < v.size(); i++) {
			int x1 = v.get(i).first;
			int y1 = v.get(i).second;
			int y2 = result.get(result.size() - 1).second;

			if (y2 >= x1) {
				result.get(result.size() - 1).second = Math.max(y1, y2);
			} else {
				result.add(new Pair(x1, y1));
			}
		}

		return result;
	}

}

class Pair {
	public int first;
	public int second;

	public Pair(int x, int y) {
		this.first = x;
		this.second = y;
	}
}
