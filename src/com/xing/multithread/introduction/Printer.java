package com.xing.multithread.introduction;

public class Printer implements Runnable {

    private final String message;

    public Printer(String msg){
        this.message = msg;
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(message);
        }
    }
}
