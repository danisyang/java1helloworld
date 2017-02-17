package com.yzn.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Dennis Yang on 2017/2/17.
 *      Collection      :单例集合的根接口
 *          List        ：如果是实现了List接口的集合类，该集合类具备的特点是：有序，可重复
 *          Set         ：如果是实现了Set接口的集合类，该集合类具备的特点是：无序，不可重复
 *
 *      迭代相关的方法：
 *          1：toArray()
 *          2：iterator()
 *
 *          迭代器的方法：
 *          1：hasNext()          是否有元素
 *          2：next()             返回下一个元素
 *          3：void remove()      移除迭代器返回的上一个元素(如果之前没有使用过，则报错)
 *
 */
public class CollectionExercises {
    public static void main(String[] args){
        Collection collection = new ArrayList();
        collection.add("yzn");
        collection.add("curry");
        collection.add("kobe");
        collection.add("michael");
        collection.add("durant");
//
//        Object[] arr = collection.toArray();
//        for(int i = 0;i<arr.length;i++){
//            System.out.print(arr[i]+",");
//        }
        //用迭代器去遍历
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+",\n");
        }
        iterator.remove();
        System.out.println(collection);
    }
}
