package com.yzn.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dennis Yang on 2017/2/22.
 *      HashSet 的实现原理：
 *          往HashSet里面添加元素的时候，HashSet会首先调用元素的HashCode方法得到元素的Hash值。
 *          然后通过移位等运算，就可以算出该元素在哈希表中的存储位置。
 *
 *          情况1：如果算出来的位置没有其他元素，那么直接把本元素存入进去。
 *          情况2：如果算出来的位置有其他元素，会调用equals方法与该位置的所有元素一一比较一次，如果
 *          equals返回的是true，那么看作是重复元素，不加入进去，否则，把元素添加该位置。
 *          （TIPs：一个位置可以存储不止一个元素。）
 */
class man{
    String name ;
    int id;
    public man(String name,int id ){
        this.id = id;
        this.name = name;
    }
    @Override
    public int hashCode(){
        System.out.println("- - -- -- - - hash code  is called !- -  ---"+this.name);
        return this.id;
    }
    @Override
    public String toString(){
        return this.name;
    }
    @Override
    public boolean equals(Object object){
        man m = (man)object;

        System.out.println("- - - - equals is called - - - - - - -");
        return this.id == m.id;
    }
}
public class HashSetExercise {
    public static void main(String[] args){
        Set set = new HashSet();
        set.add("3");
        set.add("1");
        set.add("2");
        set.add("2");
        set.add("1");
        set.add("wang");
        set.add(new man("张三",001));
        set.add(new man("李四",002));
        set.add(new man("王五",003));
        set.add(new man("陈六",004));
        set.add(new man("陈六",004));

        System.out.println(set);
    }
}
