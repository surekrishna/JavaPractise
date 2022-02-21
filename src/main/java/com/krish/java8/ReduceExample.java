package com.krish.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class ReduceExample {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(3, 8, 12, 46, 32, 19, 82);
		
		int sum = 0;
		
		for(int n : numbers)
			sum += n;
		
		System.out.println(sum);

		System.out.println(numbers.stream().mapToInt(n -> n).sum());
		
		System.out.println(numbers.stream().reduce(0, (a, b) -> a + b));
		
		System.out.println(numbers.stream().reduce((a, b) -> a + b).get());
		
		System.out.println(numbers.stream().reduce(Integer::sum).get());
		
		System.out.println(numbers.stream().max((a, b) -> a.compareTo(b)).get());
		
		System.out.println(numbers.stream().reduce(Integer::max).get());
		
		System.out.println(numbers.stream().reduce((a, b) -> a > b ? a : b).get());
		
		List<String> names = List.of("Krishna", "Ramesh", "Suresh", "Gireesh");
		
		System.out.println(names.stream().reduce((a, b) -> a.length() >= b.length() ? a : b).get());
		
		double result = getEmployees().stream()
				.filter(e -> e.getGrade().equalsIgnoreCase("A"))
				.map(Employee1::getSalary)
				.mapToDouble(s -> s)
				.average().getAsDouble();
		
		System.out.println(result);
		
		double result1 = getEmployees().stream()
							.filter(e -> e.getGrade().equalsIgnoreCase("A"))
							.map(Employee1::getSalary)
							.mapToDouble(s -> s)
							.sum();
				
		System.out.println(result1);
	}
	
	public static List<Employee1> getEmployees() {
		List<Employee1> employees = new ArrayList<>();
		
		employees.add(new Employee1(1L, "Krishna", "A", 135000.00));
		employees.add(new Employee1(1L, "Ramesh", "A", 126000.00));
		employees.add(new Employee1(1L, "Suresh", "C", 35000.00));
		employees.add(new Employee1(1L, "Gireesh", "B", 78000.00));
		employees.add(new Employee1(1L, "Raina", "C", 40000.00));
		employees.add(new Employee1(1L, "Sunaina", "A", 124000.00));
		
		return employees;
	}
	
	public static List<Employee1> getEmployees1() {
		List<Employee1> employees = new ArrayList<>();
		
		for(int i = 1; i <= 1000; i++) {
			employees.add(new Employee1(Long.valueOf(i), "Krishna" + i, "A", Double.valueOf(new Random().nextDouble() * 100000)));
		}
		
		return employees;
	}

}

class Employee1 {
	
	private Long id;
	private String name;
	private String grade;
	private Double salary;
	
	public Employee1(Long id, String name, String grade, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", grade=" + grade + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(grade, id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return Objects.equals(grade, other.grade) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(salary, other.salary);
	}
	
}
