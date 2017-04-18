package com.yzn.ioStream;

import java.io.File;

/**
 * Created by yzn-bjut on 2017/4/18.
 */
public class FileEx {
    public static void main(String[] args){
        File file = new File("D:\\a.txt");
        File file1 = new File("D:\\b.txt");
        File file2 = new File("D:");
        File file3 = new File(file2,"a.txt");
        File file4 = new File("D:\\","a.txt");

        System.out.println("文件是否存在？"+file.exists());
        System.out.println("文件是否存在？"+file1.exists());
        System.out.println("文件是否存在？"+file2.exists());
        System.out.println("文件是否存在？"+file3.exists());
        System.out.println("文件是否存在？"+file4.exists());

    }
}
