package com.krish.java8;

public class StaticMethodExample implements StaticMethod {

	public static void main(String[] args) {
		var obj = new StaticMethodExample();
		
		StaticMethod.staticMethod();
		staticMethod();
		obj.overrideMethod();
	}

	static void staticMethod() {
		System.out.println("Class static method!");
	}
	
	@Override
	public void overrideMethod() {
		System.out.println("Interface Overriden method.");
	}

}

interface StaticMethod {
	static void staticMethod() {
		System.out.println("Interface static method!");
	}
	
	void overrideMethod();
}
