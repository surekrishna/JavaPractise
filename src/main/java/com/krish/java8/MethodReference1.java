package com.krish.java8;

public class MethodReference1 {

	public static void main(String[] args) {
		MethodReference1 obj = new MethodReference1();
		Runnable run = obj::m1;//only method arguments should match of run() method, modifier and return can be anything
		Thread t = new Thread(run);
		t.start();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Main -> " + i);
		}

	}
	
	private int m1() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("m1 -> " + i);
		}
		
		return 1;
	}

}
