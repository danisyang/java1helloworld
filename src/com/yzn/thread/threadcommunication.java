package com.yzn.thread;

/**
 * Created by Dennis Yang on 2017/2/16.
 *      wait():         等待  让当前线程在以锁对象为标识符的线程池里面等待。
 *      notify():       唤醒  在以锁对象为标识符的线程池里面的线程唤醒一个线程。
 *
 *      wait与notify方法要注意的事项：
 *      1.wait与notify方法都是属于Object对象的
 *      2.wait与notify方法都是在同步代码块中或者是同步函数中才可以使用
 *      3.wait与notify方法必须要由锁对象调用
 */
//生产者与消费者问题。
class Product{
    boolean flag = false;// if the product is produced.
    double price ;
    String name ;
}
class producter extends Thread{
    int i = 0;
    Product product;
    public producter(String name,Product product){
        super(name);
        this.product = product;
    }
    @Override
    public void run() {
        while(true){
            synchronized (product) {
                if (product.flag != false) {
                    //已经有了产品。等待就可以了
                    try {
                        product.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    if (i % 2 == 0) {
                        product.name = "apple";
                        product.price = 2.12;
                        product.flag = true;
                        System.out.println("procude a " + product.name + " at price " + product.price);
                    } else {
                        product.name = "banana";
                        product.price = 6.66;
                        product.flag = true;
                        System.out.println("procude a " + product.name + " at price " + product.price);
                    }
                    i++;
                    product.notify();
                }
            }
        }
    }
    }

class Consumer extends Thread{
    Product product ;
    public Consumer(String name,Product product){
        super(name);
        this.product = product;
    }
    public void run(){
        while(true){
            synchronized (product){
                if (product.flag==true){
                    System.out.println("吃掉一个:"+product.name+" 价格是:"+product.price);
                    product.flag = false;
                    product.notify();
                }
                else{
                    try{
                        product.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
public class threadcommunication {
    public static void main(String[] args){
        Product product = new Product();
        Consumer consumer = new Consumer("consumer",product);
        producter producter1 = new producter("producer",product);
        consumer.start();
        producter1.start();
    }
}
