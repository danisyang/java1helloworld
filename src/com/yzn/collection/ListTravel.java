package com.yzn.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Dennis Yang on 2017/2/21.
 */
public class ListTravel {
    public static void main(String[] args){
        List list = new ArrayList();
        list.add("001");
        list.add("002");
        list.add("003");
        list.add("004");
        list.add("005");
        int i = 0;
        while(i<5){
            System.out.print(list.get(i++)+",");
        }
        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()){
            System.out.print(listIterator.next()+",");
        }
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+",");
        }
    }
}
