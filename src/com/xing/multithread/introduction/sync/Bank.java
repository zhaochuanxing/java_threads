package com.xing.multithread.introduction.sync;

public class Bank {

    private String name;
    private int money;

    public Bank(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //存款
    public synchronized void deposit(int m) {
        this.money += m;
    }

    //取款
    public synchronized boolean withDraw(int m){
        if(this.money>=m){
            money -=m;
            return true;
        }else{
            return false;
        }
    }

    public String getName(){
        return name;
    }


}
