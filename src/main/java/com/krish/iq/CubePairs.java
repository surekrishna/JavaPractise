package com.krish.iq;

//https://www.geeksforgeeks.org/count-pairs-a-b-whose-sum-of-cubes-is-n-a3-b3-n/
//https://www.tutorialspoint.com/count-pairs-a-b-whose-sum-of-cubes-is-n-a-3-plus-b-3-n-in-cplusplus
public class CubePairs {

	public static void main(String[] args) {

		System.out.println(getCubePairs(6));
		System.out.println(getCubePairs(9));
		System.out.println(getCubePairs(35));
	}
	
	public static int getCubePairs(int number) {
		int count = 0;
		
		for(int a = 0; a < Math.cbrt(number); a++) {
			int bCube = number - (a * a * a);
			
			int b = (int) Math.cbrt(bCube);
			
			if((b * b * b) == bCube)
				count++;
		}
		
		return count;
	}

}
