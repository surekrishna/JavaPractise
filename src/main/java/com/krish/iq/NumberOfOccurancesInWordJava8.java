package com.krish.iq;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfOccurancesInWordJava8 {

	public static void main(String[] args) {
		String value = "welcome to my home and my home welcome you";
		List<String> values = List.of(value.split(" "));

		Map<String, Long> result = values.stream()
											.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);
		
		String value1 = "welcome to java java welcome you";
		
		List<String> values1 = new ArrayList<>();
		values1.addAll(List.of(value.split(" ")));
		values1.addAll(List.of(value1.split(" ")));
		
		Map<String, Long> result1 = values1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(result1);
	}
}
