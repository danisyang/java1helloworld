package com.yzn.ioStream;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by yzn-bjut on 2017/4/18.
 */
public class FileGetMethodFilter {
    public static void main(String[] args){
        File file = new File("D:\\JDK");
        File[] files = file.listFiles(new myFilter());//传一个过滤器的参数
        for (File file1:files){
            System.out.println(file1.getName());
        }
    }
}
class myFilter implements FilenameFilter{
    @Override
    public boolean accept(File dir, String name) {
        //dir 文件的目录
        //name 文件名
      /*  System.out.println("文件夹："+dir+"  文件名："+name);*/
        if (name.endsWith(".txt")){
            return true;
        }
        return false;
    }
}