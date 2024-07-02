package com.gv.synchronization.assignment;

public class RunnableTable implements Runnable {
    private Table table;

    public RunnableTable(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable();
    }
}
