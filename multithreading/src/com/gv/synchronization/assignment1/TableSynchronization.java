package com.gv.synchronization.assignment1;

public class TableSynchronization {
	
    public static void main(String[] args) {
        Table table = new Table();
        
//        RunnableTable runnable1 = new RunnableTable(table,10);
        new Thread(()-> table.printTable(10)).start();
        
        
//        RunnableTable runnableTable2 = new RunnableTable(table,20);
        new Thread(()-> table.printTable(20)).start();

        new Thread (()->{
        	for (int i=1; i<=10;i++)
        		System.out.println("i : " + i);
        	
        }).start();
    }
}
