package com.yzn.NewFeatureJDK15;

/**
 * Created by Dennis Yang on 2017/4/17.
 */
public class Enum {
    public static void main(String[] args){
        Person person = new Person("ada",Gender.man);
        System.out.println("name:"+person.getName()+" Gender:"+person.getSex());

    }
}
class Person{
    private String name;
    private Gender sex;
    public Person(String name,Gender sex){
        this.name = name;
        this.sex = sex;
    }

    public Gender getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }
}
enum Gender{
    man,woman;
}
