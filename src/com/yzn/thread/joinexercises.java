package com.yzn.thread;

/**
 * Created by Dennis Yang on 2017/2/16.
 *      join() 方法：一个线程如果执行了join语句，那么就有新的线程加入，执行语句的线程必须让步
 *                   给新加入的线程执行，等其执行完毕之后再执行。
 *      daemon守护线程（后台线程）：daemon是守护线程，当有其他线程时候，他可以执行，当没有其他线程时，他
 *                          结束自身线程运行。
 *      setDaemon(boolean on) ：设置线程是否为守护线程，(在start之前设置)
 */
class mother extends  Thread{
    public mother(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("妈妈买菜");
        System.out.println("妈妈切菜");
        System.out.println("妈妈准备炒菜");
        System.out.println("妈妈发现没有酱油了");
        System.out.println("妈妈叫儿子去买酱油");
        son son1 = new son("son");
        son1.start();
        try{
            son1.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("妈妈炒完了菜");
        System.out.println("全家人一起在吃饭");

    }
}
class son extends Thread{
    public son(String name){
        super(name);
    }
    public void run(){
        System.out.println("儿子听见妈妈叫去买酱油");
        System.out.println("儿子在路上走啊走");
        System.out.println("儿子买了酱油");
        try{
            sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("儿子回到了家，把酱油给妈妈");
    }
}
public class joinexercises {
    public static void main(String[] args){
        mother mon = new mother("mon");
        mon.start();
    }
}
