package com.krish.java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceExamples {

	public static void main(String[] args) {
		getNumbers().stream()
					.filter(n -> n % 2 == 0)
					.forEach(System.out::println);
		
		getNumbers().stream()
					.map(n -> n * n).forEach(System.out::println);

		getEmployees().stream()
						.filter(e -> e.getId() > 1)
						.filter(e -> e.getId() < 5)
						.forEach(System.out::println);
	}

	private static List<Integer> getNumbers() {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(15);
		numbers.add(10);
		numbers.add(13);
		numbers.add(24);
		numbers.add(13);
		
		return numbers;
	}
	
	private static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1L, "test", "test@gmail.com"));
		employees.add(new Employee(2L, "Ram", "ram@gmail.com"));
		employees.add(new Employee(3L, "Shyam", "shyam@gmail.com"));
		employees.add(new Employee(4L, "Bhaskar", "bhaskar@gmail.com"));
		employees.add(new Employee(5L, "Shekhar", "shekhar@gmail.com"));
		employees.add(new Employee(6L, "Muttu", "muttu@gmail.com"));
		employees.add(new Employee(7L, "Partha", "partha@gmail.com"));
		
		return employees;
	}
}

class Employee {
	
	private Long id;
	private String name;
	private String email;
	
	public Employee() {
		
	}
	
	public Employee(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
}
