package com.krish.solid;

public class InterfaceSegregation implements PitzzaOnline {

	public static void main(String[] args) {
		InterfaceSegregation ifs = new InterfaceSegregation();
		ifs.onlineOrder();
		ifs.onlinePayment();

	}

	@Override
	public void onlineOrder() {
		System.out.println("Your Pitzza is ordered.");
		
	}

	@Override
	public void onlinePayment() {
		System.out.println("Your Payment completed.");
		
	}

}

//Interface are segregated into different ways instead of single interface
interface PitzzaOnline {
	void onlineOrder();
	void onlinePayment();
}

interface PitzzaOffline {
	void walkinOrder();
	void cashPayment();
}

interface PitzzaPhoneCall {
	void mobilecallOrder();
	void cashOnDelivery();
}
