package com.krish.iq;

import java.util.List;
import java.util.stream.Collectors;

public class AUB {

	public static void main(String[] args) throws Exception {

		List<Integer> numbers = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25);

		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		System.out.println("Even Numbers = " + evenNumbers);

		List<Integer> oddNumber = numbers.stream().filter(n -> n %2 != 0).collect(Collectors.toList());

		System.out.println("Odd Numbers = " + oddNumber);
		
		List<String> names = List.of("Vivek", "Krishna", "Salma");
		
		boolean isExist = names.stream().anyMatch(n -> "Vivek".equals(n));
		
		names.stream().filter(n -> "Vivek".equals(n)).collect(Collectors.toList());
		
		names.stream().filter(n -> "ivek".equals(n)).findAny().orElseThrow(() -> new Exception("Not Found!"));
	}

}
