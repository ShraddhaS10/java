package com.gv.multithreading.polling.classes;

public class MessagePrint {

	private String msg;
	private boolean isReady;
	
	public String getMsg() {
		synchronized (this) {
		while(!isReady)
			try {
				wait();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		isReady=false;
		notifyAll();
		return msg;
	}
	}

	public void setMsg(String msg) {
		synchronized (this) {
			if (isReady) {
				try {
					wait();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			isReady=true;
			this.msg=msg;
			System.out.println("Set :" + msg);
			notify();
			
		}
		
	}
	
}
