package com.krish.test;

import java.util.List;
import java.util.stream.Collectors;

public class Singleton {

	public static void main(String[] args) {
		//age > 20
		
		List<Customer> customers = getCustomers();
		
		List<Customer> result = customers.stream().filter(c -> c.getAge() > 20).collect(Collectors.toList());
		System.out.println(result);
		
	}
	
	private static List<Customer> getCustomers() {
		return List.of(
				new Customer(1, "John", 18),
				new Customer(1, "Mike", 20),
				new Customer(1, "Scoot", 21),
				new Customer(1, "Ravi", 31),
				new Customer(1, "Suresh", 24));
	}

}



class Customer {
	int id;
	String name;
	int age;
	
	public Customer(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}



