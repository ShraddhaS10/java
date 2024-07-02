package com.gv.synchronization.assignment2;

public class Messages {
    
    private String msg;
    
    public Messages(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
		return msg;
	}
    
	public void printMessage(String msg) {
        System.out.println("[");
        synchronized (this) {
            System.out.println(msg);
        }
        System.out.println("]");
    }
}