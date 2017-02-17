package com.yzn.thread;

/**
 * Created by Dennis Yang on 2017/2/14.
 * 需求：银行账户有5000块，丈夫拿存折，妻子拿卡，取钱比赛，每次只能取1000，要求不准出现线程安全问题。
 */
class catchmoney extends Thread{
    static int total = 5000;
    public catchmoney(String name){
        super(name);
    }
    @Override
    public void run(){
        while(true){
            synchronized ("block"){
                if (total>0){
                    total = total - 1000;
                    System.out.println("取款人:"+this.getName()+" 剩余金额 :"+total);
                }
                else{
                    System.out.println("can not catch money !"+"total money :"+total);
                    break;
                }
            }
        }
    }
}
public class bankproblem {
    public static void main(String[] args){
        catchmoney wife = new catchmoney("wife");
        catchmoney husband = new catchmoney("husband");
        wife.start();
        husband.start();
    }
}
