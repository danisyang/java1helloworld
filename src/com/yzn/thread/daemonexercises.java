package com.yzn.thread;

/**
 * Created by Dennis Yang on 2017/2/16.
 *      守护线程（后台线程）：daemon是守护线程，当有其他线程时候，他可以执行，当没有其他线程时，他
 *                          结束自身线程运行。
 *      setDaemon(boolean on) ：设置线程是否为守护线程，(在start之前设置)
 */
class update extends Thread{
    public update(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i = 0;i<101;i++){
            System.out.println("更新已经完成："+i+"%");
            try{
                sleep(100);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class daemonexercises {
    public static void main(String[] args){
        update update1 = new update("QQupdate");

        update1.setDaemon(true);
        update1.start();
        System.out.println("isDaemon?"+update1.isDaemon());
        for (int i = 0;i<101;i++){
            System.out.println("Thread name is:"+Thread.currentThread().getName()+"完成"+i+"%");
        try{
            Thread.sleep(10);
        }catch (Exception e){
            e.printStackTrace();
        }
        }
    }
}
