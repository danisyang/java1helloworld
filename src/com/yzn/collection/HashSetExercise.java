package com.yzn.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dennis Yang on 2017/2/22.
 */
public class HashSetExercise {
    public static void main(String[] args){
        Set set = new HashSet();
        set.add("3");
        set.add("1");
        set.add("2");
        set.add("1");
        set.add("wang");
        System.out.println(set);
    }
}
