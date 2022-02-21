package com.krish.java8;

public class DefaultMethodExample implements defaultMethod {

	public static void main(String[] args) {
		var obj = new DefaultMethodExample();
		obj.square(2);
		obj.defaultMethod();

	}
	
	@Override
	public void defaultMethod() {
		System.out.println("class default method!");
	} 

	@Override
	public void square(int number) {
		System.out.println(number * number);
		
	}

}

interface defaultMethod {
	
	void square(int number);
	
	default void defaultMethod() {
		System.out.println("interface default method!");
	}
}

@FunctionalInterface
 interface FunctionalInterface_one
{
    public void firstInt_method();
 
    //@Override
    public String toString();                //Overridden from Object class
 
   // @Override
    public boolean equals(Object obj);        //Overridden from Object class
}
