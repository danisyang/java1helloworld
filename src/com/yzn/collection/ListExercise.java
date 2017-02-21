package com.yzn.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Dennis Yang on 2017/2/21.
 *      List接口中特有的方法：
 *
 *      添加：
 *              add(int index,E element)
 *              addAll(int index,Collection<? Extends E> c)
 *      获取：
 *              get(int index)
 *              indexOf(Object o)
 *              lastIndexOf(Object o)
 *              subList(int fromIndex,int toIndex)
 *      修改：
 *              set(int index,E element)
 *      迭代：
 *              listIterator()
 *
 *      ListIterator特有的方法：
 *
 *              添加：
 *                      hasPrevious()       判断是否存在上一个元素
 *                      previous()          当前指针向上移动一个元素，然后再取出当前指针的指向元素
 *                      next()              先取出当前指针指向元素，再让指针向下移动一个位置
 *
 *                      add(E e)            把当前元素插入到当前指针所指向的位置上
 *                      set(E e)            替换迭代器最后一次返回的元素
 */
public class ListExercise {
    public static void main(String[] args){
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("4");
        list.add("2");
        list.add("4");
        list.add("1");
     /*   System.out.println(list);
        list.add(2,"3");
        System.out.println(list);
        List list1 = new ArrayList();
        list1.add("ac");
        list1.add("bd");
        list1.add("efg");
        list.addAll(2,list1);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.subList(1,4));
        System.out.println(list);
        list.set(1,"12");
        System.out.println(list);*/
        ListIterator iterator = list.listIterator();
        iterator.next();
        iterator.set("update");
        iterator.add("new add0");
        System.out.println(list);

        System.out.println("has previous?"+iterator.hasPrevious());

        iterator.add("new add");
        System.out.println(list);
    }
}
