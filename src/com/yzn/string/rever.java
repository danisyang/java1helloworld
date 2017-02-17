package com.yzn.string;

import sun.misc.MessageUtils;

/**
 * Created by Dennis Yang on 2017/2/8.
 * toString() method of char[] is not to change char[] to string ,but print hash code of char[]/
 */
public class rever {
    public static void main(String[] args){
        String str = "hash code is jsaidjaskld1";
        System.out.println("str ="+str);
        System.out.println("revert = "+revert(str));
    }
    public static String revert(String str){
        int length = str.length();
        char[] value = str.toCharArray();
        char[] reValue = new char[length];
        int Index = length -1;
        int low = 0;
        while(low<length)
        {
            reValue[low++]=value[Index--];
        }
        System.out.println(reValue);
        String ans = new String(reValue);
       return ans;
    }
}
