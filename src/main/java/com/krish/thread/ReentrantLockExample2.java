package com.krish.thread;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample2 {

	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1("FirstThread");
		MyThread1 t2 = new MyThread1("SecondThread");
		t1.start();
		t2.start();
		
	}

}

class MyThread1 extends Thread {
	
	static ReentrantLock lock = new ReentrantLock();
	
	public MyThread1(String name) {
		super(name);
	}
	
	public void run() {
		
		if(lock.tryLock()) {
			System.out.println(Thread.currentThread().getName() + " got lock and performing safe operations.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lock.unlock();
		} else {
			System.out.println(Thread.currentThread().getName() + " unable to get the lock performing alternative operaitons.");
		}
	}
}
