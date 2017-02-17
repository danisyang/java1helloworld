package com.yzn.thread;

/**
 * Created by Dennis Yang on 2017/2/15.
 */
public class runnableexercises implements Runnable{
    static int total = 50;
    @Override
    public void run(){
        while(true) {
            synchronized ("block") {
                if (total > 0) {
                    System.out.println("thread name:" + Thread.currentThread().getName() + "sale the " + total);
                    total--;
                } else {
                    System.out.println("sale done!");
                    break;
                }
            }
        }
    }

    public static void main(String[] args){
        runnableexercises run = new runnableexercises();
        Thread thread = new Thread(run,"station 1");
        Thread thread2 = new Thread(run,"station 2");
        Thread thread3 = new Thread(run,"station 3");
        thread.start();
        thread2.start();
        thread3.start();

    }


}
