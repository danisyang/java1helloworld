package com.yzn.newfeature;

/**
 * Created by yzn-bjut on 2017/4/17.
 */
public class Enum {
    public static void main(String[] args){
        Person ada = new Person("ada",Sex.man);
        System.out.println(ada.getName()+ada.getSex());
    }
}
enum  Sex{
    man,
    woman;
        }
class Person{
    private String name;
    private Sex sex;
    public  Person(String name,Sex sex){
       this.name = name;
       this.sex = sex;
    }
    public String getName(){
        return this.name;
    }
    public Sex getSex(){
        return this.sex;
    }


}
