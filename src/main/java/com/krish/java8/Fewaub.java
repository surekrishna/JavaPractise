package com.krish.java8;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Fewaub {

	public static void main(String[] args) {

		List<String> names = List.of("Krishna", "King", "Queen", "Prince", "Princess");
		
		/* short circuit operations anyMatch, allMatch, noneMatch */
		
		// Check if the value is present or not in given list using JDK 8
		boolean isExist = names.stream().anyMatch(name -> "krishnal".equalsIgnoreCase(name));
		
		if (isExist)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		
		boolean allMatch = names.stream().allMatch(n -> n.length() >= 4);
		if(allMatch)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		boolean noneMatch = names.stream().noneMatch(n -> "none".equals(n));
		if(noneMatch)
			System.out.println("Yes");
		else
			System.out.println("No");

		
		/* Method reference to print the values */
		
		// Print list of elements using method reference
		List<Employee1> employees = ReduceExample.getEmployees();
		
		employees.stream().map(Employee1::getName).forEach(System.out::println);
		
		System.out.println("====================");
		
		boolean isEmpExist = employees.stream().map(Employee1::getName).filter(n -> "Krishna".equals(n)).findFirst().isPresent();
		if(isEmpExist)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		System.out.println("====================");
		
		Employee1 empKrish = ReduceExample.getEmployees().get(0);
		
		if(employees.contains(empKrish))
			System.out.println("Yes");
		else
			System.out.println("No");
		
		
		//Method Reference using static method
		Add add1 = Fewaub::addition;
		System.out.println(add1.add(2, 3));
		
		BiFunction<Integer, Integer, Integer> add2 = Fewaub::addition;
		System.out.println(add2.apply(3, 4));
		
		//Method Reference using instance method
		Addition addition = new Addition();
		Add add3 = addition::add;
		System.out.println(add3.add(3, 6));
		
		Add add4 = new Addition()::add;
		System.out.println(add4.add(2, 8));
		
		//Method Reference using constructor
		MethodConstructor1 methodConstructor1 = MethodConstructor::new;
		methodConstructor1.hello("krish");
		
		Function<Integer, Integer> squareIt = i -> i * i;
		Function<Integer, Integer> cubeIt = i -> i * i * i;
		
		System.out.println(squareIt.andThen(cubeIt).apply(2));
		
		Consumer<Integer> csquare = i -> System.out.println(i*i);
		Consumer<Integer> ccube = i -> System.out.println(i*i*i);
		
		csquare.andThen(ccube).accept(2);
		
	}
	
	public static int addition(int a, int b) {
		return a + b;
	}

}

interface Add {
	
	int add(int a, int b);
	
}

class Addition {
	
	public int add(int a, int b) {
		return a + b;
	}
	
}

class MethodConstructor {
	
	public MethodConstructor() {
		System.out.println("No arg constructor");
	}
	
	public MethodConstructor(String name) {
		System.out.println(name);
	}
	
}

interface MethodConstructor1 {
	void hello(String name);
	//void hello();//can't it should be only one abstract method
}
