package com.krish.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortList {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(34);
		numbers.add(27);
		numbers.add(71);
		numbers.add(45);
		
		Collections.sort(numbers);
		System.out.println(numbers);
		
		numbers.stream().sorted().forEach(System.out::println);
		System.out.println("============");
		numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		System.out.println("============");
		numbers.stream().sorted((a, b) -> a.compareTo(b)).forEach(System.out::println);
		System.out.println("============");
		numbers.stream().sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);
		
		
		List<Employee1> employees = ReduceExample.getEmployees();
		
		//Ascending Order by salary
		Collections.sort(employees, (e1, e2) -> (int) (e1.getSalary() - e2.getSalary()));
		System.out.println(employees);
		
		//Descending Order by name
		Collections.sort(employees, new Comparator<Employee1>() {
			@Override
			public int compare(Employee1 o1, Employee1 o2) {
				return o2.getName().compareTo(o1.getName());
			}
		});
		System.out.println(employees);
		
		//Ascending Order by grade
		employees.stream().sorted((a, b) -> a.getGrade().compareTo(b.getGrade())).forEach(System.out::println);
		
		//Ascending Order by name
		employees.stream().sorted(Comparator.comparing(Employee1::getName)).forEach(System.out::println);
		
		//Ascending Order by salary
		employees.stream().sorted((a, b) -> (int) (a.getSalary() - b.getSalary())).forEach(System.out::println);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "D");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "A");
		map.put(5, "E");
		
		map.forEach((k, v) -> System.out.println(k + " " + v));
		
		map.entrySet().stream().forEach(System.out::println);
		
		System.out.println("===================");
		//Traditional approach to sort a map
		List<Entry<Integer, String>> entrySet = new ArrayList<>(map.entrySet());
		Collections.sort(entrySet, (e1, e2) -> e1.getKey() - e2.getKey());
		
		for(Entry<Integer, String> entry : entrySet)
			System.out.println(entry.getKey() + " " + entry.getValue());
		
		System.out.println("===================");
		//Java8 approach to sort a map
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("===================");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		Map<Integer, Employee1> employeeMap = new TreeMap<>();
		employeeMap.put(3, new Employee1(1L, "John", "A", 120000.00));
		employeeMap.put(8, new Employee1(3L, "Linda", "C", 67000.00));
		employeeMap.put(23, new Employee1(2L, "Tiger", "B", 100000.00));
		employeeMap.put(45, new Employee1(5L, "Scoot", "A", 110000.00));
		employeeMap.put(82, new Employee1(4L, "Jacob", "B", 90000.00));
		
		
		employeeMap.entrySet().stream()
					.sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee1::getSalary)))
					.forEach(System.out::println);
		
		employeeMap.entrySet().stream()
		.sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee1::getSalary).reversed()))
		.forEach(System.out::println);
		
		System.out.println("Original map count = " + employeeMap.entrySet().stream().count());
		
		System.out.println("Count after filter = " + employeeMap.entrySet().stream().filter(e -> e.getValue().getSalary() >= 100000.00).count());
		
		employeeMap.entrySet().stream().limit(1).forEach(System.out::println);
					
	}

}
