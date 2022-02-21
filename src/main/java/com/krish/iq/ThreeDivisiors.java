package com.krish.iq;

import java.util.ArrayList;
import java.util.List;

public class ThreeDivisiors {

	public static void main(String[] args) {

		System.out.println(get3Divisiors(List.of(6, 10), 2));
		System.out.println(get3Divisiors(List.of(6), 1));
		System.out.println(get3Divisiors(List.of(16, 49), 2));
		
	}
	
	public static List<Integer> get3Divisiors(List<Integer> queries, int number) {
		List<Integer> divisiors = new ArrayList<>();
		
		for(int i = 0; i < number; i++) {
			int num = queries.get(i);
			int c = 0;
			
			for(int j = 1; j < num; j++) {
				int count = 0;
				for(int k = 1; k <= j; k++) {
					if(j % k == 0)
						count++;
				}
				
				if(count == 3)
					c++;
			}
			
			divisiors.add(c);
		}
		
		return divisiors;
	}

}
