package com.krish.iq;

import java.util.List;

public class LimitAndSkipJava8 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 19, 24, 38, 45, 67, 89, 111, 123, 143, 178);
		
		numbers.stream()
				.limit(5)
				.forEach(System.out::println);
		
		System.out.println("===============");
		
		numbers.stream()
		.limit(50)
		.forEach(System.out::println);
		
		System.out.println("===============");
		
		numbers.stream()
				.skip(7)
				.forEach(System.out::println);
		
		System.out.println("===============");
		
		numbers.stream()
		.skip(-70)//java.lang.IllegalArgumentException: -70
		.forEach(System.out::println);
	}

}
