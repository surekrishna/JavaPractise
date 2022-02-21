package com.krish.feb;

//https://leetcode.com/problems/sqrtx/
//https://leetcode.com/problems/sqrtx/discuss/1731478/Java-Binary-Search-Solution
public class SqrtX {

	public static void main(String[] args) {

		System.out.println(mySqrt(4));
		System.out.println(mySqrt(8));
		System.out.println(mySqrt(71));
		
	}

	//Time Complexity --> Worst case - O(log n) | Best case - O(1)
	public static int mySqrt(int x) {
		if(x == 1) {
			return x;	
		}
		
		int low = 0;
		int high = x - 1;
		int result = 0;
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			
			if(mid * mid == x) {
				return mid;
			} else if (mid * mid < x) {
				low = mid + 1;
				result = mid;
			} else {
				high = mid - 1;
			}
		}
		
		return result;
	}

}
