package com.krish.iq;

import java.util.ArrayList;
import java.util.List;

public class CountSquares {

	public static void main(String[] args) {

		System.out.println(getSquares(9));
		System.out.println(getSquares(3));
		System.out.println(getSquares(25));
	}
	
	public static int getSquares(int number) {
		List<Integer> squares = new ArrayList<>();
		
		for(int i = 1; i < number; i++) {
			int square = i * i;
			if(square < number)
				squares.add(square);
			else 
				break;
		}
		
		System.out.println(squares);
		return squares.size();
	}

}
