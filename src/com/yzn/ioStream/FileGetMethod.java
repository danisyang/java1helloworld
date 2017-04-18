package com.yzn.ioStream;

import java.io.File;

/**
 * Created by yzn-bjut on 2017/4/18.
 */
public class FileGetMethod {
    public static void main(String[] args){
        //get method
        //static File[] listRoots() 列出所有根目录
        /*File file = new File("D:\\JDK");
        File[] file1 = File.listRoots();
        for(File file2 :file1){
            System.out.println(file2);
        }*/
        //listFiles()
        File file = new File("D:\\JDK");
        File[] files = file.listFiles();
        for (File file1:files){
            if (file1.getName().endsWith(".txt")){
                System.out.println(file1.getName());}
        }
        String[] strings = file.list();
        for (String string:strings){
            System.out.println(string);
        }
    }
}
