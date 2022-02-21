package com.krish.iq;


public class PassByValue {

	public static void main(String[] args) {

		Customer1 c = new Customer1("krish");

		System.out.println(c.name);
		m(c);
		System.out.println(c.name);

	}

	public static void m(Customer1 c) {

		c = new Customer1("kong");//comment this line and see output and understand how it works
		System.out.println(c.name);
		c.name = "king";
		System.out.println(c.name);
	}

}

class Customer1 {
	String name;

	Customer1(String name) {
		this.name = name;
	}
}
