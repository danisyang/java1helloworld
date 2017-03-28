package com.yzn.regex;
import java.util.regex.Pattern;
/**
 * Created by Dennis Yang on 2017/3/27.
 * 需求：匹配以大写字母开头，以句号结尾的句子
 */
public class RegEx {
    public static void main(String[] args){
        String s = "When would you go ?";
        String s1 = "Have a dinner. ";
        String s2 = "ha is alive.";
        System.out.println(s.matches("([A-Z])(.*)//."));
        System.out.println(s1.matches("([A-Z])(.*)。"));
        System.out.println(s2.matches("([A-Z])(.*)//."));
    }
}
