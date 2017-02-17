package com.yzn.thread;

/**
 * Created by Dennis Yang on 2017/2/14.
 *    同步代码块：        synchronized(锁对象){
 *                            需要同步的代码....
 *                      }
 *    需要注意的事项：
 *          1:任意的一个对象都可以成为锁对象
 *          2:在同步代码块中调用了sleep方法并不是释放锁对象的
 *          3:只有真正存在线程安全的问题中才使用同步代码块，否则会降低效率
 *          4:多线程操作的锁对象必须是唯一共享的，否则无效
 */
class sellstation extends Thread{
    public sellstation(String name){
        super(name);
    }
    static int tatol = 250;
    static Object object  = new Object();
    @Override
    public  void run(){

       while(true){
           synchronized ("block") {if(tatol>0){
            System.out.println("sellstation"+this.getName()+" number "+tatol);
            tatol--;
        }
        else {
            System.out.println("sell done");
            break;
        }
        }
       }
    }
}
public class synchronizedexercises {
    public static void main(String[] args){
        sellstation sell1 = new sellstation("1");
        sellstation sell2 = new sellstation("2");
        sellstation sell3 = new sellstation("3");
        sell1.start();
        sell2.start();
        sell3.start();
    }
}
