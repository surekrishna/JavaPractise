package com.krish.test;

import java.util.UUID;

//public class Test {
//
//	public static void main(String[] args) {
//
//		System.out.println(UUID.randomUUID());
//	}
//
//}

class Shapes {
	Shapes() {
		System.out.println("This is a shape");
	}

	Shapes(String name) {
		System.out.println("Shape name is: " + name);
	}
}

public class Test extends Shapes {
	Test() {
		//super("Triangle");
		super();
		System.out.println("Triangle constructor");
	}

	public static void main(String[] args) {
		Test obj = new Test();
	}
}
