package com.gv.collections.entities;
class Generic<T> {
    private T t;
    
    public Generic(T t) {
        this.t = t;
    }
    
    public T getT() {
        return t;
    }
    
    public void setT(T t) {
        this.t = t;
    }
}