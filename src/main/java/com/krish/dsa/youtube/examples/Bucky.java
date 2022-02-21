package com.krish.dsa.youtube.examples;

import java.util.ArrayList;
import java.util.List;

public class Bucky {

	public static void main(String[] args) {

		program1();
		program2();
		program3();
		System.out.println("Factorial of a number using recursion = " + program4(5));
		System.out.println("Factorial of a number using recursion = " + program4(-5));
		
		System.out.println("Factorial of a number = " + program5(5));
		System.out.println("Factorial of a number = " + program5(-5));
		
		program6();
	}
	
	public static void program1() {
		String[] names = {"funk", "chunk", "bunk", "furry", "nordon"};
		

		for(String name : names) {
			//startsWith
			if(name.startsWith("fu"))
				System.out.println(name + " starts with fu");
			
			//endsWith
			if(name.endsWith("unk"))
				System.out.println(name + " ends with unk");
		}
	}
	
	public static void program2() {
		String name = "buckyrobertsbuckyroberts";
		
		System.out.println(name.indexOf('k'));
		
		System.out.println(name.indexOf('k', 5));//skips the first 5 chars
		
		System.out.println(name.indexOf("rob"));
		
		System.out.println(name.indexOf("rob", 10));//skips the first 10 chars
	}
	
	public static void program3() {
		String a = "Bacon";
		String b = "monster";
		String c = "    Hi    ";
		
		System.out.println(a.concat(b));
		
		System.out.println(a.replace('B', 'F'));
		System.out.println(b.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(c.trim());
		
	}
	
	public static long program4(long number) {
		if(number < 0)
			return -1;
		else if(number <= 1)
			return 1;
		else
			return number * program4(number - 1);
	}
	
	public static long program5(long number) {
		long fact = 1;
		
		if(number < 0)
			return -1;
		else if(number <= 1)
			return 1;
		
		for(int i = 2; i <= number; i++)
			fact *= i;
		
		return fact;
	}
	
	public static void program6() {
		String[] things = {"eggs", "lasers", "hats", "pie"};
		List<String> list1 = new ArrayList<>();
		for(String thing : things)
			list1.add(thing);
		
		String[] moreThings = {"lasers", "hats"};
		List<String> list2 = new ArrayList<>();
		for(String moreThing : moreThings)
			list2.add(moreThing);
		
		for(int i = 0; i < list1.size(); i++)
			System.out.printf("%s ", list1.get(i));
		
		System.out.println();
		
		for(int i = 0; i < list2.size(); i++)
			System.out.printf("%s ", list2.get(i));
	}

}
