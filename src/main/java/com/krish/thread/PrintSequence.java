package com.krish.thread;

//https://codedaily.in/java-program-for-printing-sequence-using-3-threads/
//https://stackoverflow.com/questions/30964133/3-threads-printing-numbers-in-sequence
public class PrintSequence {

	private volatile int count = 1;
	private Object monitor = new Object();
	private volatile int threadIdToRun = 1;
	
	public static void main(String[] args) {

		PrintSequence print = new PrintSequence();
		Thread t1 = new Thread(print.new Printer(1));
		Thread t2 = new Thread(print.new Printer(2));
		Thread t3 = new Thread(print.new Printer(3));
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	class Printer implements Runnable {
		
		private int threadId;
		
		public Printer(int threadId) {
			this.threadId = threadId;
		}

		@Override
		public void run() {

			while (count <= 30) {
				
				synchronized (monitor) {
					if(threadId != threadIdToRun) {
						try {
							monitor.wait(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else {
						System.out.println("Thread " + threadId + " printetd " + count);
						count++;
						
						if(threadId == 1)
							threadIdToRun = 2;
						else if(threadId == 2)
							threadIdToRun = 3;
						else if(threadId == 3)
							threadIdToRun = 1;
						
						monitor.notifyAll();
					}
				}
			}
		}
		
	}

}
