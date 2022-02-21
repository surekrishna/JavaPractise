package com.krish.iq;

public class JumpingNumberOrNot {

	public static void main(String[] args) {

		System.out.println(isJumpingNumber(678987));
		System.out.println(isJumpingNumber(952));
		System.out.println(isJumpingNumber(121));
		System.out.println(isJumpingNumber(123));
		
	}
	
	static boolean isJumpingNumber(int number) {
		int temp = number;
		
		while (temp > 0) {
			int rem1 = temp % 10;
			
			temp /= 10;
			
			if(temp != 0) {
				int rem2 = temp % 10;
				
//				if(rem1 > rem2 && rem1 - rem2 != 1)
//					return false;
//				else if(rem1 < rem2 && rem2 - rem1 != 1)
//					return false;
				
				//OR
				if(Math.abs(rem1 - rem2) != 1)
					return false;
			}
			
		}
		
		return true;
	}

}
