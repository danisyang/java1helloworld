package com.yzn.thread;

/**
 * Created by Dennis Yang on 2017/2/14.
 * 线程的常用方法：
 *      getName()        返回线程的名字
 *      sleep()          睡眠相应的毫秒数，是静态方法，哪个线程调用该方法哪个线程睡眠相应时间
 *      currentThread()  返回当前的线程对象，该方法是一个静态的方法，谁执行该方法返回谁的对象
 *      getPriority()    返回该线程对象的优先级，默认的优先级是5 [0,10],10最大
 *      setPriority(int newPriority)    设置线程的优先级，虽然设置了线程的优先级，但是具体哪个线程先执行完，取决于底层的实现。
 *
 *
 *
 *
 */
public class threadexercises extends Thread {
    public threadexercises(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println(this.getName());
        try{sleep(1000);}
        catch (Exception e){
            e.printStackTrace();
        }

        //to do
//        for(int i = 0;i < 100;i++){
//            System.out.println("副线程正在执行:"+i);
//        }
//        super.run();

    }

    public static void main(String[] args){
        threadexercises thread1 = new threadexercises("javathread");
        thread1.setPriority(10);
        thread1.start();
        System.out.println(thread1.currentThread().getName());
//        for(int i = 0;i < 100;i++){
//            System.out.println("主线程正在执行"+i);
//        }
    }
}
