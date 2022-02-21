package com.krish.ihsmarkit;

public class Program3 {

	public static void main(String[] args) {

		Obj obj = new Obj("abc");
		method(obj);
		System.out.println(obj.value);
	}

	private static void method(Obj obj) {
		obj.value = "xyz";
	}

	static class Obj {
		public String value;

		public Obj(String value) {
			this.value = value;
		}
	}
}
