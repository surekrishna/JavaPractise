package com.krish.iq;

//https://www.techiedelight.com/determine-string-valid-number-java/
public class StringIsValidNumber {

	public static void main(String[] args) {

		String[] values = { "4.325", "4.325a", "x4.325", "4325", "1.", "1.1.", "1.1.1", "1.1.1.", "+1.1.", "-1.1.",
				"-1.1", "+23", "-23" };
		
		for (String val : values)
			System.out.println(val + " " + isValidNumber1(val));

		System.out.println("=================================");

		for (String val : values)
			System.out.println(val + " " + isValidNumber2(val));

		System.out.println("=================================");

		for (String val : values)
			System.out.println(val + " " + isValidNumber3(val));
		
		System.out.println("=================================");

		for (String val : values)
			System.out.println(val + " " + isValidNumber4(val));

	}

	public static boolean isValidNumber1(String val) {
		if (null == val || val.isBlank())
			return false;

		for (char c : val.toCharArray())
			if (c < '0' || c > '9')
				return false;

		return true;
	}

	public static boolean isValidNumber2(String val) {

		return null == val || val.isBlank() ? false : val.chars().allMatch(Character::isDigit);

	}

	public static boolean isValidNumber3(String val) {

		return null == val || val.isBlank() ? false : val.matches("[0-9]+");

	}

	public static boolean isValidNumber4(String val) {
		if(null == val || val.isBlank())
			return false;
		
		try {
			Integer.parseInt(val);
		} catch(Exception e) {
			return false;
		}
		
		return true;
	}

}
