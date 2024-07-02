package com.gv.synchronization.assignment1;

public class RunnableTable implements Runnable {
    private Table table;
    private int TableNo;
    
    public RunnableTable(Table table,int tableNo) {
        this.table = table;
        this.TableNo = tableNo;
        
    }

    @Override
    public void run() {
        table.printTable(TableNo);
    }
}
