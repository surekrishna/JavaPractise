package com.krish.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample3 {

	public static void main(String[] args) {

		MyThread2 t1 = new MyThread2("FirstThread");
		MyThread2 t2 = new MyThread2("SecondThread");
		
		t1.start();
		t2.start();
	}

}

class MyThread2 extends Thread {
	
	static ReentrantLock lock = new ReentrantLock();
	
	public MyThread2(String name) {
		super(name);
	}
	
	public void run() {
		
		do {
			try {
				if(lock.tryLock(5, TimeUnit.SECONDS)) {
					System.out.println(Thread.currentThread().getName() + " got lock");
					Thread.sleep(30000);
					lock.unlock();
					System.out.println(Thread.currentThread().getName() + " released lock..");
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + " not got lock trying again.....");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while(true);
	}
}
