class person{
    person(int i,String name){
        this.id = i;
        this.name = name;
    }
    int id;
    String name;
   /* @Override
    public String toString( ){
        return this.name;
    }*/
}
public class Main  {


    public static void main(String[] args) {
        person a = new person(1,"yzn");
        System.out.println("Hello World!");
        System.out.println("This is new world!");
        System.out.println(a);
        System.out.println(a.toString());
    }
}
