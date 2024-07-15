package com.gv.multithreading.deadlock;

public class LambdaDeadLock {

	public static void main(String[] args) {
		Object lock1 = new Object();
		Object lock2 = new Object();
		
		new Thread(
				()->{
					synchronized (lock1) {
						System.out.println("Thread1 acquires lock1");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						synchronized (lock2) {
							System.out.println("Thread1 acquires lock2");
						}
						
					}
				}).start();
		
		new Thread(
				()->{
					synchronized (lock2) {
						System.out.println("Thread2 acquires lock2");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						synchronized (lock1) {
							System.out.println("Thread2 acquires lock1");
						}
						
					}
				}).start();
		
		// thread1.start();
		// thread2.start();
		
	}
}
