package com.yzn.string;

/**
 * Created by Dennis Yang on 2017/1/31.
 */
public class Stringexercises {
    public static void main(String[] args){
        String str1 = "yzn";
        System.out.println(str1+str1.hashCode());
        str1 = str1 +"is a good boy!";
        System.out.println(str1+str1.hashCode());

        String str2 = "yzn";
        System.out.println(str2+str2.hashCode());
        String str3 = new String("yzn");
        System.out.println(str3+str3.hashCode());
        String str4 = new String("yzn");
        System.out.println(str4+str4.hashCode());

        System.out.println("Str1 == Str2 "+(str1==str2));
        System.out.println("Str2 == Str3 "+(str2==str3));
        System.out.println("Str3 == Str4 "+(str3==str4));
        System.out.println("Str3.equals(Str4) "+str3.equals(str4));
        System.out.println("Str3.equals(Str1) "+str3.equals(str1));
        System.out.println("Str3.equals(Str2) "+str3.equals(str2));


    }
}
