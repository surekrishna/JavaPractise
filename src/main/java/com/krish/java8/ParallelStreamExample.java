package com.krish.java8;

import java.util.List;

public class ParallelStreamExample {

	public static void main(String[] args) {
		
		List<Employee1> employees = ReduceExample.getEmployees1();
		
		long start = 0;
		long end = 0;
		
		start = System.currentTimeMillis();
		double result = employees
				.stream()
				.map(Employee1::getSalary)
				.mapToDouble(s -> s)
				.average().getAsDouble();
		end = System.currentTimeMillis();
		
		System.out.println("Stream time = " + (end - start) + " avg = " + result);
		
		start = System.currentTimeMillis();
		double result1 = employees
							.parallelStream()
							.map(Employee1::getSalary)
							.mapToDouble(s -> s)
							.average().getAsDouble();
		end = System.currentTimeMillis();
		
		System.out.println("Parallel Stream time = " + (end - start) + " avg = " + result1);

	}

}
