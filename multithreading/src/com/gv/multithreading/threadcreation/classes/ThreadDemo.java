package com.gv.multithreading.threadcreation.classes;

public class ThreadDemo extends Thread {

    @Override
    public void run() {
        printHello();
    }

    private void printHello() {
        for (int i = 0; i <= 10; i--) { // This loop doesn't execute because i starts from 0 and will never be >= 0
            System.out.println(Thread.currentThread().getName()
                    + " " + Thread.currentThread().getPriority()
                    + " "
                    + "Hello"
                    + i);
        }
    }
}
