package com.gv.multithreading.synchronization.classes;

public class PrintMessage {

	private String msg;
	
	public PrintMessage(String msg) {
		this.msg = msg;
	}
	
	public synchronized void printMessage() {
		synchronized (this) {
			
		for (int i=0;i<=10;i++) {
			try {
				System.out.println(msg);
				Thread.sleep(200);
				
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
}