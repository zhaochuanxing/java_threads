package com.xing.multithread.introduction;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        MyThread myThread = new MyThread();
//        myThread.run();
//
//        for(int i=0;i<10000;i++){
//            System.out.println("Main run "+i);
//        }

//        Runnable runnable = new Printer("Good");
//        Thread thread = new Thread(runnable);
//        thread.start();

        Runnable printer = new Printer("zhao");
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        Thread thread = threadFactory.newThread(printer);
        thread.start();


    }
}
