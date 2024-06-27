package com.gv.collections.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {

	public static void main(String[] args) {
		BlockingQueue<Integer> intQueue = new LinkedBlockingQueue<>(5);
		//intQueue.put(10);

//		try {
//			intQueue.put(10);
//			intQueue.put(10);
//			intQueue.put(10);
//			intQueue.put(10);
//			intQueue.put(10);
//			intQueue.put(10);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		new Thread(()->{
			for(int i=0;i<100;i++) {
				try {
					System.out.println("{Set : " + i);
					intQueue.put(i);
					Thread.sleep(100);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
					// TODO: handle exception
				}
				
			}
		}).start();
		
		new Thread(()->{
			int temp=0;
			while(temp<=100) {
				try {
					System.out.println("Get : " + temp);
					temp = intQueue.take();
					Thread.sleep(500);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
					// TODO: handle exception
				}
			}
		}).start();
	}
}
