package com.yzn.collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Dennis Yang on 2017/3/6.
 * Created by Dennis Yang on 2017/3/2.
 *      HashCode方法默认情况是返回内存地址，但是String类的HashCode方法是由具体的字符算出来的。
 *      TreeSet:如果元素具备自然属性，可以使用元素的自然顺序排序。
 *          注意事项：1：往TreeSet里添加元素的时候，如果元素本身具备自然顺序，那么按照自然顺序排序存储。
 *                   2：如果不具备自然顺序，那么元素必须实现Comparable接口，把元素的比较规则定义在
 *                   compareTo(T o)方法上。
 *                   3：如果比较元素的时候，compareTo(T o)方法返回0；那么该元素视为重复元素，无法添加
 *                   进TreeSet，（注意！TreeSet与HashCode/equals方法没有任何关系。）
 *                   4：往TreeSet添加元素的时候，如果元素本身没有具备自然顺序的特性，而元素的类也没有
 *                   实现comparable接口，那么必须要在创建TreeSet的时候传入一个比较器。
 *                   5：往TreeSet添加元素的时候，如果元素本身没有具备自然顺序的特性，而元素的类实现了
 *                   comparable接口，在创建TreeSet对象的时候，传入了一个比较器，那么比较器的比较规则
 *                   优先使用。
 *              如何自定义比较器：自定义一个类实现Comparator接口即可，把元素之间的比较规则定义在compare
 *              方法内即可。自定义比较器的格式：
 *                  class 类名 implements Comparator{
 *
 *                  }
 *                  推荐使用：比较器的方式Comparator
 *          底层是使用（红黑树）的数据结构实现的。
 */
class MyComparator implements Comparator{
    @Override
    public int compare(Object o1,Object o2){
        Employee employee = (Employee)o1;
        Employee employee1 = (Employee)o2;
        return employee.id-employee1.id;
    }
}
class Employee implements Comparable{
    int id;
    String name;
    int salary;
    public Employee(int id,String name,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "[name:"+name+",id"+this.id+",salary"+this.salary+"]";
    }
    @Override
    public int compareTo(Object o){
        Employee employee = (Employee)o;
        return this.salary - employee.salary;
    }
}
public class TreeSetExe2 {
    public static void main(String[] args){
        Employee employee = new Employee(110,"james",6000);
        Employee employee1 = new Employee(220,"jack",4000);
        Employee employee2 = new Employee(830,"mark",3400);
        Employee employee3 = new Employee(440,"dennis",8000);
        Employee employee4 = new Employee(550,"rechard",9999);
        MyComparator myComparator = new MyComparator();
        TreeSet treeSet = new TreeSet(myComparator);
        treeSet.add(employee);
        treeSet.add(employee1);
        treeSet.add(employee2);
        treeSet.add(employee3);
        treeSet.add(employee4);
        treeSet.add(new Employee(660,"newman",9999));
        System.out.println(treeSet);
    }
}
