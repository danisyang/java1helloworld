package com.yzn.string.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yzn-bjut on 2017/4/13.
 */
public class RegExFind {
    public static void main(String[] args){
        String content = "luo hong bu shi wu qing wu,hua zuo chun ni geng hu hua.";
        String regex = "\\b[a-zA-Z]{3}\\b";//tip:\b是正则表达式里的单词边界匹配符号
        //step1:先把正则String编译成Pattern对象
        Pattern pattern = Pattern.compile(regex);
        //step2：使用正则对象匹配字符串生成一个Matcher对象
        Matcher matcher = pattern.matcher(content);
        //先find后才可以使用group显示
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
