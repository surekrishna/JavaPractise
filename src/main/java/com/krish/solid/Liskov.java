package com.krish.solid;

public class Liskov {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "krish");
		
		PersonalDetails details = new PersonalDetails(2, "King", "test@gmail.com", "9999999999");
		
		Liskov liskov = new Liskov();
		//Here i can pass Employee or PersonalDetails object 
		liskov.printDetails(employee);
		liskov.printDetails(details);
	}
	
	void printDetails(Employee emp) {
		emp.printMe();
	}
}

class Employee {

	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
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

	public void printMe() {
		System.out.println("Employee [id=" + id + ", name=" + name + "]");
	}

}

class PersonalDetails extends Employee {

	private String email;
	private String mobile;
	
	public PersonalDetails(int id, String name, String email, String mobile) {
		super(id, name);
		this.email = email;
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
