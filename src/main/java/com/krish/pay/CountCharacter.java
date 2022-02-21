package com.krish.pay;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacter {

	public static void main(String[] args) {

		List<Character> list = List.of('m', 'o', 'm', 'd', 'a', 'd');
		
		Map<Character, Long> result = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);
		
		String name = "welcome to my home my home welcome you";
		
		Map<String, Long> result1 = Arrays.asList(name.split(" ")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result1);
	}

}
