package com.krish.thread;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

	public static void main(String[] args) {

		ReentrantLock lock = new ReentrantLock();
		
		lock.lock();
		lock.lock();
		
		System.out.println(lock.isLocked());//true
		System.out.println(lock.isHeldByCurrentThread());//false
		System.out.println(lock.isFair());//false
		System.out.println(lock.getHoldCount());//2
		lock.unlock();
		System.out.println(lock.getHoldCount());//1
		System.out.println(lock.getQueueLength());//0
		lock.unlock();
		System.out.println(lock.getHoldCount());//0
		System.out.println(lock.isLocked());//false
		
	}

}
