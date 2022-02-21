package com.krish.pay;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Java8 {

	public static void main(String[] args) {

		IntSummaryStatistics stats = Arrays.asList(1, 2, 3, 4).stream().mapToInt(Integer::intValue).summaryStatistics();

		System.out.println(stats.getSum());
		System.out.println(stats.getCount());
		System.out.println(stats.getAverage());		
		System.out.println(stats.getMax());		
		System.out.println(stats.getMin());		
	}

}
