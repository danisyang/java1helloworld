package com.yzn.collection;

import java.util.TreeSet;

/**
 * Created by Dennis Yang on 2017/3/6.
 */
public class TreeSetExe3 {
    public static void main(String[] args){
        TreeSet treeSet = new TreeSet();
        String str = "2 10 9 87 66";
        String[] array = str.split(" ");
        for (int i = 0;i<array.length;i++){
            treeSet.add(Integer.parseInt(array[i]));
        }
        System.out.println(treeSet);
    }
}
