package com.yzn.string;

/**
 * Created by Dennis Yang on 2017/2/8.
 * to implement the trim method! myTrim()
 */
public class exercises0208 {
    public static void main(String[] args){
    String arg = "  yangzn is a good boy!";
    System.out.println(arg);
    String argg = myTrim(arg);
    String argh = arg.trim();
    System.out.println("myTrim = "+argg);
    System.out.println("trim = "+argh);
    }

    public static String myTrim(String str){
        if(str.isEmpty())
            return "NULL";
        char[] strs = str.toCharArray();
        int startIndex = 0;
        int endIndex = str.length()-1;
        while(true){
            if(strs[startIndex]==' ')
            {
                startIndex++;
            }
            else
                break;
        }
        while(true){
            if(strs[endIndex]==' '){
                endIndex--;
            }
            else
                break;
        }
        return str.substring(startIndex,endIndex+1);//substring function is [start,end)
    }
}

