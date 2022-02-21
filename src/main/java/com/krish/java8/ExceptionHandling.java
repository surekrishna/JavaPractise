package com.krish.java8;

import java.util.List;

public class ExceptionHandling {

	public static void main(String[] args) {
		List<String> numbers = List.of("4", "345", "xyz");
		
		//Approach - 1
		numbers.forEach(n -> {
			try {
				System.out.println(Integer.parseInt(n));
			} catch(Exception e) {
				System.out.println("Exception occured = " + e);
			}
		});
		
		System.out.println("==============================");
		
		//Approach - 2
		numbers.forEach(ExceptionHandling::printList);
	}
	
	//Approach - 2
	public static void printList(String value) {
		try {
			System.out.println(Integer.parseInt(value));
		} catch (Exception e) {
			System.out.println("Exception occured = " + e);
		}
	}
}
