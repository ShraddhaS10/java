package com.gv.multithreading.threadcreation;

import com.gv.multithreading.threadcreation.classes.ThreadDemo;

public class ThreadUsingThreadClass {

	public static void main(String[] args) {
		ThreadDemo thread1 = new ThreadDemo();
		thread1.setName("Thread-1");
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		
		ThreadDemo thread2 = new ThreadDemo();
		thread1.setName("Thread-2");
		thread1.setPriority(Thread.MAX_PRIORITY);
		
		thread2.start();
	}
}