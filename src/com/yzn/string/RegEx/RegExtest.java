package com.yzn.string.RegEx;

/**
 * Created by yzn-bjut on 2017/3/28.
 */
public class RegExtest {
    public static void main(String[] args){
        String regex = "cc[abc]";
        System.out.println("inijnniojasdabc".matches(regex));
        System.out.println("ccbc".matches(regex));

        System.out.println("inijnniojasdac".matches(regex));

        System.out.println("ccc".matches(regex));

        System.out.println("cca".matches(regex));

    }
}
