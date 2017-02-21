package com.yzn.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Dennis Yang on 2017/2/19.
 *      collection中的方法：
 *
 *      增：
 *          boolean add(E e)                        添加成功返回true，失败返回false
 *          boolean addAll(Collection<Object> c)    把一个集合中的元素添加到另外一个集合中去
 *
 *      删：
 *          void clear()                            清空集合中的元素
 *          boolean remove(Object o)                清空指定的对象(若有多个，只删除第一个)
 *          boolean removeAll(Collection<?> c)      清空所有的c集合中的对象(重复的全部清空)
 *          boolean retainAll(Collection<?> c)      清空所有不是c集合中的元素
 *
 *      查：
 *          int size()                              返回集合的容量
 *
 *      判断:
 *          boolean contains(Object o)              判断集合是否包含指定元素o
 *          boolean containsAll(Collection<?> c)    判断集合是否完全包含集合c,正常集合包含空集
 *          boolean isEmpty()                       判断集合是否为空
 *
 *      迭代：
 *          Object[] toArray()                      把当前集合返回Object类的数组
 *          Iterator<E> iterator()                  以当前集合返回一个迭代器
 */
public class IntroductionCollection {
    public static void main(String[] args){

        Collection c = new ArrayList();
        c.add("yzn");
        c.add("zj");
        c.add("ij");
        System.out.println(c.toString()+c.add("jy"));
        System.out.println(c.toString()+c.add("jy"));
        System.out.println(c.toString()+c.add("jy"));
        Collection c1 = new ArrayList();
       /* c1.addAll(c);
        System.out.println(c1);
        c1.clear();
        System.out.println(c1);
        c.remove("jy");
        c.removeAll(c1);
        System.out.println(c.toString()+c.remove("dy"));
        System.out.println(c);*/
        Collection c2 = new ArrayList();
        c2.add("jy");
        System.out.println(c);

//        c.removeAll(c2);
        c.retainAll(c2);

        System.out.println(c+" size:"+c.size());
        c1.isEmpty();
        c1.contains("yz");
        System.out.println("c2 contains all c1?while c1is null?"+c2.contains(c1));
        Object[] a = c.toArray();
        for (int i = 0;i < a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println(c);
        c1.iterator();
        Iterator iterator = c1.iterator();
        System.out.println(iterator.toString());

    }
}
