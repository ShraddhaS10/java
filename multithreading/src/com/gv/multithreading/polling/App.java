package com.gv.multithreading.polling;

import com.gv.multithreading.polling.classes.MessageConsumer;
import com.gv.multithreading.polling.classes.MessagePrint;
import com.gv.multithreading.polling.classes.MessageSupplier;

public class App {

	public static void main(String[] args) {
		MessagePrint messagePrint = new MessagePrint();
		Thread consumer = new Thread(new MessageConsumer(messagePrint));
		Thread supplier = new Thread(new MessageSupplier(messagePrint));
		
		consumer.start();
		supplier.start();
	}
}
