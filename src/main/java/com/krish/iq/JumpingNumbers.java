package com.krish.iq;

import java.util.ArrayList;
import java.util.List;

public class JumpingNumbers {

	public static void main(String[] args) {

		int number = 50;
		List<Integer> jumpingNumbers = new ArrayList<>();
		
		for(int i = 0; i <= number; i++) {
			if(JumpingNumberOrNot.isJumpingNumber(i))
				jumpingNumbers.add(i);
		}
		
		System.out.println(jumpingNumbers);
	}

}
