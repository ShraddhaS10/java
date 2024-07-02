package com.gv.synchronization.assignment1;

public class Table {

    public void printTable(int tableNumber) {
        System.out.println("Table No: "+tableNumber);

    synchronized (this) {
        for (int i = 1; i <= 10; i++) {
            
            try {
                Thread.sleep(100); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(tableNumber);
        }
    }
}
}