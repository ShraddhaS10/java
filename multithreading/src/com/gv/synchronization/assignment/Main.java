package com.gv.synchronization.assignment;

public class Main {
    public static void main(String[] args) {
        Table table1 = new Table();
        table1.setTableNumber(10);

        Table table2 = new Table();
        table2.setTableNumber(20
        		);

        RunnableTable runnableTable1 = new RunnableTable(table1);
        RunnableTable runnableTable2 = new RunnableTable(table2);

        Thread thread1 = new Thread(runnableTable1);
        Thread thread2 = new Thread(runnableTable2);

        thread1.start(); 
        thread2.start();
    }
}
