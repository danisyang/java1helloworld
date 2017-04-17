package com.yzn.newfeature;

/**
 * Created by yzn-bjut on 2017/4/17.
 */
public class For {
    public static void main(String[] args){
        int[] array = new int[100];
        for(int i:array){//i用来接收每次遍历得到的中间变量值
            array[i] = i+1;
        }
        for (int i:array){
            System.out.println(i);
        }
    }
}
