package com.yzn.string;

import java.util.Random;

import static java.lang.Math.*;

/**
 * Created by Dennis Yang on 2017/2/14.
 *      Random类         随机数类，在util包中，可以接受参数产生各种类型的随机数
 *      Math类           数学类，主要有各种数学公式等
 *                       abs(double a)绝对值
 *                       ceil(double a)向上取整
 *                       floor(double a)向下取整
 *                       round(double a)四舍五入
 */
public class mathexericses {
    public static void main(String[] args){
        Random random = new Random();
        char[] chars = {'a','e','i','o','u','中','华','人','民','功','夫','熊','猫','2',};
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0;i < 4; i++){
            int index = random.nextInt(chars.length);
            stringBuffer.append(chars[index]);
        }
        System.out.println(stringBuffer);
//        搞一个验证码 想都不想直接用随机数类
//        System.out.println("abs:"+abs(-11));
//        System.out.println("ceil:"+ceil(3.12));
//        System.out.println("floor:"+floor(3.12));
//        System.out.println("round:"+round(3.50));
//        System.out.println("random:"+Math.random());
//        System.out.println();
//        Random random = new Random();
//        boolean ran  = random.nextBoolean();
//        System.out.println(ran);


    }
}
