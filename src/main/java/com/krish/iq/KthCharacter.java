package com.krish.iq;

public class KthCharacter {

	public static void main(String[] args) {

		//String value = "a2b2c3";
		//String value = "ab4c12ed3";
		String value = "ab4c2ed3";
		
		String result = "";
		
		String temp = "";
		int length = value.length();
		
		for(int i = 0; i < length;) {
			
			while (i < length && value.charAt(i) >= 'a' && value.charAt(i) <= 'z') {
				temp += value.charAt(i);
				i++;
			}
			
			int startIndex = i;
			int count = 0;
			while (i < length && value.charAt(i) >= '0' && value.charAt(i) <= '9') {
				count++;
				i++;
			}
			
			result += temp.repeat(Integer.parseInt(value.substring(startIndex, startIndex + count)));
			temp = "";
			
		}
		
		System.out.println(result);
	}

}
 