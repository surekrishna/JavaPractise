package com.krish.java8;

public class FunctionalInterfaceExamples {

	int instanceVariable = 10;
	
	public void m2() {
		int localVariable = 5;
		A a = () -> {
			System.out.println(instanceVariable);
			System.out.println(localVariable);
			instanceVariable = 20;
			System.out.println(instanceVariable);
			
			//Local variable localVariable defined in an enclosing scope must be final or effectively final
			//localVariable = 10;
		};
		
		a.m1();
		
	}
	
	public static void main(String[] args) {
		var obj = new FunctionalInterfaceExamples();
		obj.m2();
		
		SumInterface sumResult = (a, b) -> System.out.println("SUM = " + a + b);
		sumResult.sum(5, 3);
	}
}


interface A {
	void m1();
}

@FunctionalInterface
interface SumInterface {
	void sum(int a, int b);
}
