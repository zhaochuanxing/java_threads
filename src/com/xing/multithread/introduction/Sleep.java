package com.xing.multithread.introduction;

public class Sleep {

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println("传兴，加油");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
