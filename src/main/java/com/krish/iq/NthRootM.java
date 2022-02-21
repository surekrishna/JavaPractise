package com.krish.iq;

public class NthRootM {

	public static void main(String[] args) {
		
		System.out.println(root(3, 9));
		System.out.println(Math.pow(125.0, 1.0/3.0));

	}
	

	
	private static boolean isNthRoot(int value, int n) {
	    double a = Math.pow(value, 1.0 / n);
	    return Math.pow(Math.round(a), n) == value;
	}
	
	public static int getNthRootM(int a, int n) {
		if(n == 0) {
			return 1;	
		} else {
			int sum = getNthRootM(a, n - 1);
			sum *= a;
			return sum;
		}
	}
	
	private static double root(double base, int exp) {
        if (exp == 0){
            return 1;
        }
 
        else{
            double sum = root(base, exp-1);
            sum = sum * base;
            return sum;
        }
    }

}
