package com.learn.StaticNonStatic;

public class StaticClass {
    static int c=0;
    int a=1;
    static int b=2;
    public  void test1(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void test2(){
        System.out.println(b);
    }

    public static void main(String[] args) {
        c++;

        StaticClass sc= new StaticClass();
        System.out.println(c);
        test2();
       sc.test1();


    }
}
