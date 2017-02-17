package com.yzn.string;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Dennis Yang on 2017/2/14.
 *      Date类                       日期类
 *      SimpleDateFormat类           日期格式化类
 *                                   作用1：可以把日期转换成指定格式的字符串类 format()
 *                                   作用2：可以把一个字符串转换成对应的日期   parse()
 *
 */
public class dateexercises {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日:HH时mm分ss秒");
        String time = dateFormat.format(date);
        String strtime = "2012年12月33日:13时12分21秒";
        Date date1 ;
        try {
            date1 = dateFormat.parse(strtime);
            System.out.println(date1);
            }
        catch(Exception a){

        }
        System.out.println(time);


    }
}
