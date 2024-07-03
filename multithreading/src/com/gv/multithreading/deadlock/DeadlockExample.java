package com.gv.multithreading.deadlock;

public class DeadlockExample {

    public Thread getThread1(Object lock1, Object lock2) {
        return new Thread(new RunnableLock1(lock1, lock2));
    }

    public Thread getThread2(Object lock1, Object lock2) {
        return new Thread(new RunnableLock2(lock1, lock2));
    }

    class RunnableLock1 implements Runnable {
        Object lock1;
        Object lock2;

        public RunnableLock1(Object lock1, Object lock2) {
            this.lock1 = lock1;
            this.lock2 = lock2;
        }

        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock 1...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for lock 2...");
                synchronized (lock2) {
                    System.out.println("Thread 1: Holding lock 1 and lock 2...");
                }
            }
        }
    }

    class RunnableLock2 implements Runnable {
        Object lock1;
        Object lock2;

        public RunnableLock2(Object lock1, Object lock2) {
            this.lock1 = lock1;
            this.lock2 = lock2;
        }

        @Override
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock 2...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for lock 1...");
                synchronized (lock1) {
                    System.out.println("Thread 2: Holding lock 2 and lock 1...");
                }
            }
        }
    }

    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        DeadlockExample deadlockExample = new DeadlockExample();

        Thread thread1 = deadlockExample.getThread1(lock1, lock2);
        Thread thread2 = deadlockExample.getThread2(lock1, lock2);

        thread1.start();
        thread2.start();
    }
}
