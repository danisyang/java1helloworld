package com.yzn.collection;

import java.util.LinkedList;

/**
 * Created by Dennis Yang on 2017/2/23.
 *      LinkedList的方法：
 *          addFirst(E e)
 *          addLast(E e)
 *
 *          getFirst(E e)
 *          getLast(E e)
 *
 *          removeFirst(E e)
 *          removeLast(E e)
 *      数据结构：
 *          1：栈(后进先出)
 *              push()
 *              pop()
 *          2：队列(先进先出)
 *              offer()
 *              poll()
 *      返回逆序的迭代器的对象
 *          descendingIterator()    返回逆序的迭代器对象
 */
public class LinkedListExercise {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");
        linkedList.add("forth");
        linkedList.add("fifth");
        System.out.println("No.1:"+linkedList.getFirst());
        linkedList.addFirst("new 1");
        System.out.println("No.1:"+linkedList.getFirst());
        linkedList.removeFirst();
        System.out.println("No.1:"+linkedList.getFirst());
        System.out.println("last:"+linkedList.getLast());

        linkedList.push("pp");
        System.out.println(linkedList);
        linkedList.pop();
        System.out.println(linkedList);

        linkedList.offer("pp");
        System.out.println(linkedList);
        linkedList.poll();
        System.out.println(linkedList);


    }
}
