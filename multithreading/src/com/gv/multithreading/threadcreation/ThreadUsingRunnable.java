package com.gv.multithreading.threadcreation;

import com.gv.multithreading.threadcreation.classes.RunnableDemo;

public class ThreadUsingRunnable {

	public static void main(String[] args) {
		RunnableDemo runnable1 = new RunnableDemo();
		RunnableDemo runnable2 = new RunnableDemo();
		
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
		thread1.start();
		thread2.run();
		
	}
}