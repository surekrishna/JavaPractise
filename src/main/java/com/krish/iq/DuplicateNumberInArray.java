package com.krish.iq;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateNumberInArray {

	public static void main(String[] args) {
		Integer[] numbers = {21, 45, 1, 21, 54, 23, 61, 87, 54};
		
		Set<Integer> nums = new HashSet<>();
		
//		for(int i = 0; i < numbers.length; i++) {
//			int num = numbers[i];
//			if(!nums.add(num)) {
//				System.out.println(num);
//				break;	
//			}
//		}
		
		Set<Integer> duplicates = Stream.of(numbers)
		        .filter(n -> !nums.add(n))
		        .collect(Collectors.toSet());
		System.out.println(duplicates); // [21, 54]


	}

}
