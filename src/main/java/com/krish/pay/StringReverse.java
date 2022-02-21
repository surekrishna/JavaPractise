package com.krish.pay;

//https://www.geeksforgeeks.org/reverse-a-string-using-recursion/
public class StringReverse {

	public static void main(String[] args) {

		recursiveReverse("krishna");
	}
	
	public static void recursiveReverse(String value) {
		int length = value.length();
		
		if(null == value || length < 1) {
			System.out.println(value);
		} else {
			System.out.print(value.charAt(length - 1));
			recursiveReverse(value.substring(0, length - 1));
		}
	}

}
