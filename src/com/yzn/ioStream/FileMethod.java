package com.yzn.ioStream;

import java.io.File;
import java.io.IOException;

/**
 * Created by yzn-bjut on 2017/4/18.
 */
public class FileMethod {
    public static void main(String[] args)throws IOException{
        //create method
        File file = new File("D:\\b.txt");
        System.out.println("b.txt是否存在？"+file.exists());
        System.out.println(file.createNewFile());
        System.out.println("b.txt是否存在？"+file.exists());
        File dir = new File("D:\\aaax.txt");
        System.out.println(dir.mkdir());
        File dir1 = new File("D:\\xasx\\asx");
        System.out.println(dir1.mkdir());
        System.out.println(dir1.mkdirs());
        //delete method
        file.deleteOnExit();

    }
}

