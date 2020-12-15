package com.ggw.demo.threads;

public class InnerStartThread implements Runnable{

    public InnerStartThread(){
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("InnerStartThread start");
    }
}
