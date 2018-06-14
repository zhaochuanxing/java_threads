package com.xing.multithread.introduction;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyThread myThread = new MyThread();
        myThread.run();

        for(int i=0;i<10000;i++){
            System.out.println("Main run "+i);
        }
    }
}
