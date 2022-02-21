package com.krish.thread;

import java.util.concurrent.CountDownLatch;

//https://www.geeksforgeeks.org/difference-between-countdownlatch-and-cyclicbarrier-in-java/
public class CountDownLatchExample {

	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch latch = new CountDownLatch(4);
		Worker w1 = new Worker(1000, latch, "Worker1");
		Worker w2 = new Worker(2000, latch, "Worker2");
		Worker w3 = new Worker(3000, latch, "Worker3");
		Worker w4 = new Worker(4000, latch, "Worker4");
		
		w1.start();
		w2.start();
		w3.start();
		w4.start();
		
		latch.await();
		System.out.println(Thread.currentThread().getName() + " completed");
	}

}

class Worker extends Thread {
	
	private int delay;
	private CountDownLatch latch;
	
	public Worker(int delay, CountDownLatch latch, String name) {
		super(name);
		this.delay = delay;
		this.latch = latch;
	}
	
	public void run() {
		try {
			Thread.sleep(delay);
			latch.countDown();
			System.out.println(Thread.currentThread().getName() + " completed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
