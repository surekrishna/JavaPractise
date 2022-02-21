package com.krish.iq;

import java.util.ArrayList;
import java.util.List;

public class OnlyPositiveAndOnlyNegative {

	public static void main(String[] args) {
		int[] positiveNegative = {2, 4, 6, -2, 4, -7, -3, 123, -2, 1};
		
		List<Integer> positive = new ArrayList<>();
		List<Integer> negative = new ArrayList<>();
		
		for(int i : positiveNegative) {
			if(i > 0)
				positive.add(i);
			else
				negative.add(i);
				
		}
		
		System.out.println("Positive Numbers = " + positive);
		System.out.println("Negative Numbers = " + negative);

	}

}
