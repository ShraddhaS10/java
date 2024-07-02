package com.gv.multithreading.threadcreation;

public class ThreadCreation extends Thread {

	private int table;
	public void setTable(int table) {
		this.table=table;
	}
	
	@Override
	public void run() {
		for (int i=1;i<=10; i++)
			System.out.println(table*i);
	}
	
	public static void main(String[] args) {
		ThreadCreation thread1 = new ThreadCreation();
		ThreadCreation thread2 = new ThreadCreation();
		thread1.start();
		thread2.setTable(5);
		thread2.start();
		
	}
}
