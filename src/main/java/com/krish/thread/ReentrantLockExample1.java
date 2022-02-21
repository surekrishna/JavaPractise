package com.krish.thread;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample1 {

	public static void main(String[] args) {

		Display d = new Display();
		MyThread thread1 = new MyThread(d, "Dhoni");
		MyThread thread2 = new MyThread(d, "Yuvi");
		thread1.start();
		thread2.start();
	}

}

class MyThread extends Thread {

	private Display disaply;
	private String name;
	
	public MyThread(Display display, String name) {
		this.disaply = display;
		this.name = name;
	}
	
	public void run() {
		//disaply.wish(name);//Mixed output
		
		//wish1 and wish2 has same output
		//disaply.wish1(name);
		disaply.wish2(name);
	}
}

class Display {
	
	ReentrantLock lock = new ReentrantLock();

	public void wish(String name) {

		for (int i = 0; i < 10; i++) {
			System.out.print("GoodMorning : ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(name);
		}
	}

	public synchronized void wish1(String name) {

		for (int i = 0; i < 10; i++) {
			System.out.print("GoodMorning : ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(name);
		}
	}

	public void wish2(String name) {
		
		lock.lock();
		for (int i = 0; i < 10; i++) {
			System.out.print("GoodMorning : ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(name);
		}
		
		lock.unlock();
	}
}
