package com.krish.pay;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

//https://javarevisited.blogspot.com/2012/07/cyclicbarrier-example-java-5-concurrency-tutorial.html#axzz7Gd1szS8l
public class CyclicBarrierExample {
	
	public static void main(String[] args) {
		
		CyclicBarrier barrier = new CyclicBarrier(3, new Runnable() {
			
			@Override
			public void run() {
				System.out.println("All parties are arrived at barrier, lets play");
			}
		});
		
		Thread t1 = new Thread(new Worker(barrier), "t1");
		Thread t2 = new Thread(new Worker(barrier), "t2");
		Thread t3 = new Thread(new Worker(barrier), "t3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}

class Worker implements Runnable {
	private CyclicBarrier barrier;
	
	public Worker(CyclicBarrier barrier) {
		this.barrier = barrier;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + " is waiting for barrier");
		try {
			barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " is crossed the barrier");
	}
	
	
}