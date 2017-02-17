package com.yzn.string;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Properties;

/**
 * Created by Dennis Yang on 2017/2/9.
 * System类常用方法：
 *      arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 *          src:    源数组
 *          srcPos: 源数组中起始位置
 *          dest:   目标数组
 *          destPos:目标数组起始位置
 *          length: 复制长度
 *      currentTimeMillis()  获取当前的系统时间
 *      exit(int status)     退出jvm 如果参数是0代表正常退出，非0代表异常退出jvm
 *      gc()                 建议jvm赶快启动垃圾回收器回收垃圾
 *      getenv(String name)  根据环境变量的名字获取环境变量
 *
 *  PS：finalize()           如果一个对象被垃圾回收器回收的时候，会先调用该对象的finalize()方法
 */
public class stringbufferexerciese {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer();
        str.append(true);
        str.append(123);
        System.out.println(str.capacity());

//        for (int i=0;i<10;i++){
//            new person("person"+i);
//            System.gc();
//        }
        System.out.println("当前环境变量:"+System.getenv("JAVA_HOME"));

        String value = System.getProperty("os.arch");
        System.out.println("当前系统架构："+value);

        Properties properties = System.getProperties();
        properties.list(System.out);
//        long a = System.currentTimeMillis();
//        System.out.println(a);
//        int[] arr1 = {1,23,43,23,12,45,67};
//        int[] arr2 =new int[4] ;
//        System.arraycopy(arr1,2,arr2,1,4);
//        System.out.println(Arrays.toString(arr2));
    }
}
class person{
    String name ;
    public  person(String name){
        this.name = name;
    }
    @Override
    public void finalize() throws Throwable{
        super.finalize();
        System.out.println(this.name+"被回收了...");
    }
}
