package com.yzn.string.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yzn-bjut on 2017/4/14.
 */
public class RegExFindEmail {
    public static void main(String[] args){
        String content1 = "2876@qq.com,请联系我,gongxifacai007@sina.com.cn"
                +"请联系我：18844106607@gmail.com.请联系我，yzn@gamil.com.net";
        String regex = "[a-zA-Z1-9]\\w{5,17}@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}]";
        String reg = " \\w{3,}@\\w{2,}(\\.\\w{2,}){1,3}";
        Pattern pattern1 = Pattern.compile("reg");
        Matcher matcher = pattern1.matcher(content1);
        System.out.println("2876@qq.com".matches("\\w{3,}@\\w{2,}(\\.\\w{2,}){1,3}"));
        System.out.println("gongxifacai007@sina.com.cn".matches("\\w{3,}@\\w{2,}(\\.\\w{2,}){1,3}"));
        System.out.println("18844106607@gmail.com".matches("\\w{3,}@\\w{2,}(\\.\\w{2,}){1,3}"));
        System.out.println("yzn@gamil.com.net".matches("\\w{3,}@\\w{2,}(\\.\\w{2,}){1,3}"));
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
