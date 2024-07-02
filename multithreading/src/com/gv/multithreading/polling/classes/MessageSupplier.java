package com.gv.multithreading.polling.classes;

public class MessageSupplier implements Runnable{

	private MessagePrint print;
	
	public MessageSupplier(MessagePrint print) {
		this.print = print;
	}
	
	public void set() {
		String[] names = {"a","b","c","d","e","0"};
		
		for(String name:names)
			print.setMsg(name);
	}
	
			@Override
			public void run()
			{
				set();
			}
		
}
