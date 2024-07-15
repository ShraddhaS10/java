package com.gv.multithreading.methods;

//import java.util.Iterator;

public class MethodExamples {

	public static void main(String[] args) {
		System.out.println("Start of main method");
		
		Thread thread1 = new Thread(()->{
			try {
				for(int i=0; i<10; i++) {
					Thread.sleep(1000);
					System.out.println(i);
				}
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		});
		
		thread1.start();
		
		System.out.println("End of main Method");
		
	}
}
