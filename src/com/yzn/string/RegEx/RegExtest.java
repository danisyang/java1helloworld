package com.yzn.string.RegEx;

/**
 * Created by yzn-bjut on 2017/3/28.
 */
public class RegExtest {
    public static void main(String[] args) {
      /*  String regex = "cc[abc]";
        System.out.println("inijnniojasdabc".matches(regex));
        System.out.println("ccbc".matches(regex));

        System.out.println("inijnniojasdac".matches(regex));

        System.out.println("ccc".matches(regex));

        System.out.println("cca".matches(regex));*/
        //phone number
        String regex = "1[378](\\d){9}";
        System.out.println("188441066071".matches(regex));
        replaceAll();
        replaceAllTest();
    }
    //replace
    public static void replaceAll() {
        String reg = "1[378](\\d){9}";
        String str = "请联系我：18844124457+请联系我：18844124457+请联系我：18844124457+请联系我：18844124457+"
                + "请联系我：18844124457+请联系我：18844124457+请联系我：18844124457+请联系我：18844124457+";
        str = str.replaceAll(reg, "****");
        System.out.println(str);
    }
    //replace
    public static void replaceAllTest(){
        String str = "我我我我我我我要要要要要做做做做做做项项项项目目目目";//把重叠词换成单个的
        String regex = "(.)\\1+";//重叠词的正则表达式
        str = str.replaceAll("(.)\\1+","$1");//在正则表达式之外引用组内容，要用"$+组号"；
        System.out.println(str);
    }

}
