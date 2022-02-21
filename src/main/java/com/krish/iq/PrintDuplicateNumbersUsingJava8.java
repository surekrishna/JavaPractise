package com.krish.iq;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateNumbersUsingJava8 {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(10, 28, 87, 10, 20, 76, 28, 80, 80, 80);
		Set<Integer> nums = new HashSet<>();
		numbers.stream()
				.filter(n -> !nums.add(n))
				.peek(n -> System.out.println("From peek -> " + n))
				.collect(Collectors.toSet())
				.forEach(System.out::println);

	}

}
