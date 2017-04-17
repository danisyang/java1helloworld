package com.yzn.newfeature;

import leetcode.yzn.AddTwoNumbers2;

/**
 * Created by yzn-bjut on 2017/4/17.
 */
public class ChangableArgs {
    public static void main(String[] args){
        System.out.println(Add(1,2,3,4));
        System.out.println(Add(1));
        System.out.println(Add());
        System.out.println(Add(1,2,3,4,6,7,8,8));
    }
    public static int Add(int...num){
        int[] array = num;
        int sum = 0;
        for (int i=0;i<array.length;i++){
            sum = sum+array[i];
        }
        return  sum;
    }
}
