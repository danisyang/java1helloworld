package com.yzn.thread;

/**
 * Created by Dennis Yang on 2017/2/15.
 */
class DeadThread extends Thread{
    public DeadThread(String name){
        super(name);
    }
    @Override
    public void run(){
        if ("dennis".equals(Thread.currentThread().getName())){
            synchronized("money"){
                System.out.println("dennis get money");
                synchronized("card"){
                    System.out.println("dennis get card ! all done!");
                }
            }
        }
        else if ("james".equals(currentThread().getName())){
            synchronized("card"){
                System.out.println("james get card");
                synchronized("money"){
                    System.out.println("james get money !all done!");
                }
            }
        }
    }
}
public class deadblock {
    public static void main(String[] args){
        DeadThread thread1  =  new DeadThread("dennis");
        DeadThread thread2  =  new DeadThread("james");
        thread1.start();
        thread2.start();
    }
}
