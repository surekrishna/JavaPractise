package com.krish.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

	public static void main(String[] args) throws InterruptedException {
		ProcessingThread pt = new ProcessingThread();
		
		Thread t1 = new Thread(pt, "t1");
		Thread t2 = new Thread(pt, "t2");
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Processing count = " + pt.getCount());
	}
}

class ProcessingThread implements Runnable {
	
	//private int count;
	private AtomicInteger count = new AtomicInteger();
	
	public void run() {
		try {
			
			for(int i = 1; i < 5; i++) {
				Thread.sleep(1000);
				//count++;
				count.incrementAndGet();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int getCount() {
		//return this.count;
		return this.count.get();
	}
}
