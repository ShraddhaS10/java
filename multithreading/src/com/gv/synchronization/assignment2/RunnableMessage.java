package com.gv.synchronization.assignment2;
public class RunnableMessage {
    public static void main(String[] args) {
        Messages messages = new Messages(" ");
        
        Thread thread1 = new Thread(() -> messages.printMessage("hello"));
     //   Thread thread2 = new Thread(() -> messages.printMessage("world"));

        thread1.start();
    //    thread2.start();
    }
}