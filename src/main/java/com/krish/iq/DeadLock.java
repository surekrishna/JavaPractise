package com.krish.iq;

public class DeadLock {

	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();
		
		Thread childThread = new Thread(() -> {
			try {
				//mainThread.join(1000);//Dead Lock solution
				mainThread.join();//Dead Lock situation
			} catch (InterruptedException e) {
				System.err.println(e);
			}
			
			System.out.println("Im child Thread.");
		});
		
		childThread.start();
		
		try {
			childThread.join();
		} catch (InterruptedException e) {
			System.err.println(e);
		}
		
		System.out.println("Im main Thread");
		
	}

}
