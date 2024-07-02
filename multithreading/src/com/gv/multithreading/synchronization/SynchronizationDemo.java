package com.gv.multithreading.synchronization;

import com.gv.multithreading.synchronization.classes.PrintMessage;
import com.gv.multithreading.synchronization.classes.RunnableDemo;

public class SynchronizationDemo {

	public static void main(String[] args) {
		PrintMessage PrintM = new PrintMessage("Hello");
		
		RunnableDemo runnable1 = new RunnableDemo(PrintM);
		RunnableDemo runnable2 = new RunnableDemo(PrintM);
		
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
	}
}
