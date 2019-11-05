package com.withing.concurrent.thread.domain;

public class MyThread extends Thread {

    @Override
    public void run() {
        StringBuffer start = new StringBuffer(Thread.currentThread().getName());
        start.append("   start up");
        System.out.println(start);
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
        StringBuffer stop = new StringBuffer(Thread.currentThread().getName());
        stop.append("   shut down");
        System.out.println(stop.toString());

    }

}
