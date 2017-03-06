package com.yzn.collection;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Dennis Yang on 2017/3/2.
 *      HashCode方法默认情况是返回内存地址，但是String类的HashCode方法是由具体的字符算出来的。
 *      TreeSet:如果元素具备自然属性，可以使用元素的自然顺序排序。
 *          注意事项：1：往TreeSet里添加元素的时候，如果元素本身具备自然顺序，那么按照自然顺序排序存储。
 *                   2：如果不具备自然顺序，那么元素必须实现Comparable接口，把元素的比较规则定义在
 *                   compareTo(T o)方法上。
 *
 *
 */
class User{
    String name;
    String password;
    public User(String name,String password){
        this.name = name;
        this.password = password;
    }
    @Override
    public String toString(){
        return "name:"+this.name+";password:"+this.password;
    }
    @Override
    public boolean equals(Object obj){
        User user = (User)obj;
        return this.name.equals(user.name)&&this.password.equals(user.password);
    }
    @Override
    public int hashCode(){
        return this.name.hashCode()+this.password.hashCode();
    }
}
public class TreeSetExercises {
    public static void main(String[] args){
//        String s1 = "hello";
//        String s2 = new String("hello");
//        System.out.println(s1==s2);
//        System.out.println("s1 hashcode:"+s1.hashCode());
//        System.out.println("s1 hashcode:"+s1.hashCode());
//        System.out.println("s1 == s2? hash code :"+(s1.hashCode()==s2.hashCode()));
        HashSet hashSet = new HashSet();
        Scanner scanner = new Scanner(System.in);
       while(true){
           String name = scanner.next();
            String password = scanner.next();
            User user = new User(name,password);
            if (hashSet.add(user)){
                System.out.println("succeesed! "+hashSet);
            }else {
                System.out.println("false!");
            }
       }


    }
}
