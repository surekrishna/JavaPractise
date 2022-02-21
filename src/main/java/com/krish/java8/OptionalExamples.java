package com.krish.java8;

import java.util.Optional;

public class OptionalExamples {

	public static void main(String[] args) {
		Optional<String> maleGender = Optional.of("male");
		Optional<String> emptyGender = Optional.empty();

		System.out.println("Non empty optional maleGender = " + maleGender);
		System.out.println("empty optional emptyGender = " + emptyGender);
		
		String female = "female";
		String nullGender = null;
		
		System.out.println("ofNullable of Non empty Optional = " + Optional.ofNullable(female));
		System.out.println("ofNullable of empty Optional = " + Optional.ofNullable(nullGender));
		
		//using map operator
		System.out.println("Non empty optional using map operator to convert to uppercase = " + maleGender.map(String::toUpperCase));
		System.out.println("Non empty optional using map operator to convert to uppercase value = " + maleGender.map(String::toUpperCase).get());
		
		//since it is empty it won't do anything
		System.out.println("Empty Optional using map operator to convert to uppercase = " + emptyGender.map(String::toUpperCase));
		
		//using filter operator
		System.out.println("Non empty optional using filter operator to check eqals object comparision = " + maleGender.filter(m -> "MALE".equals(m)));
		System.out.println("Non empty optional using filter operator to check eqals object comparision = " + maleGender.filter(m -> "male".equals(m)));
		System.out.println("Non empty optional using filter operator to check eqals object comparision = " + maleGender.filter(m -> "MALE".equalsIgnoreCase(m)));
		System.out.println("Empty optional using filter operator to check eqals object comparision = " + maleGender.filter(m -> "MALE".equalsIgnoreCase(nullGender)));
				
		//isPresent method
		if(maleGender.isPresent())
			System.out.println("Value is available!");
		else
			System.out.println("Value is not available!");
		
		if(emptyGender.isPresent())
			System.out.println("Value is available!");
		else
			System.out.println("Value is not available!");
		
		//ifPresent method
		maleGender.ifPresent(m -> System.out.println("Gender value is = " + m));
		
		emptyGender.ifPresent(n -> System.out.println("Gender value is = " + n));
		
		//orElse
		System.out.println(maleGender.orElse("NA"));
		System.out.println(emptyGender.orElse("female"));
		System.out.println(maleGender.orElseGet(() -> "NA"));
		System.out.println(emptyGender.orElseGet(() -> "NA"));
		
		//orElseThrow
		emptyGender.orElseThrow(() -> new IllegalArgumentException("Can't find value!"));
		
		//NullPointerException
		System.out.println(Optional.of(nullGender));
	}
}
