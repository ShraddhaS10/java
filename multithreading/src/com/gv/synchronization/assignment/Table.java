package com.gv.synchronization.assignment;

public class Table {
    private int tableNumber;

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public synchronized void printTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello " + tableNumber * i);
            try {
                Thread.sleep(100); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
