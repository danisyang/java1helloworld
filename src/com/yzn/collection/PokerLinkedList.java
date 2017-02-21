package com.yzn.collection;

import java.util.LinkedList;

/**
 * Created by Dennis Yang on 2017/2/21.
 *      用LinkedList模拟扑克牌并洗牌。
 *      用Poker类描述扑克，用随机数拿出一张牌放在链表顶端算作一次洗牌
 */
class Poker{
    String num;
    String color;
    public Poker(String num,String color){
        this.num = num;
        this.color = color;
    }
    @Override
    public String toString(){
        return color+num;
    }
}
public class PokerLinkedList {
    public static void main(String[] args){
        String[] colors = {"红桃","方块","梅花","黑桃"};
        String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        LinkedList linkedList = new LinkedList();
        for(int i = 0; i <52;i++){
            linkedList.add(new Poker(nums[i%13],colors[i%4]));
        }
       /* System.out.println(linkedList);
        System.out.println(linkedList.size());*/
        int num;
        int times = 0;
        while(times<30) {
            num = (int) (Math.random() * 52); // [0,51]
            Poker poker = (Poker) linkedList.remove(num);
            linkedList.push(poker);
            times++;
        }
        System.out.println(linkedList);
        System.out.println(linkedList.size());
    }
}
