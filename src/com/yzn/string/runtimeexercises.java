package com.yzn.string;

import java.io.IOException;
import java.io.InterruptedIOException;

/**
 * Created by Dennis Yang on 2017/2/14.
 *      Runtime  该类主要代表了应用程序运行的环境
 *      getRuntime()    返回当前程序的运行环境对象
 *      exec(String command)    根据指定的路径去执行相应的可执行文件
 *      freeMemory()    返回java虚拟机的空闲内存量
 *      maxMemory()     返回java虚拟机试图使用的最大内存量(以字节为单位)
 *      totalMemory()   返回java虚拟机的内存总量
 */
public class runtimeexercises {
    public static void main(String[] args)throws IOException,InterruptedIOException{
        Runtime runtime = Runtime.getRuntime();
//        Process process = runtime.exec("C:\\Windows\\notepad.exe");
//
//        try {
//            Thread.sleep(3000);
//        }catch (Exception exception){
//            System.out.println("exception!");
//        }
//        process.destroy();
        System.out.println("java虚拟机的空内存量"+runtime.freeMemory());
        System.out.println("java虚拟机试图管理的最大存量"+runtime.maxMemory());
        System.out.println("java虚拟机的最大内存量"+runtime.totalMemory());

    }
}
