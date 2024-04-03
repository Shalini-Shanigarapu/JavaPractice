package com.learn.javaBasics;

public class StaticNonStatic {
    public int a=1, b=2;

    public static void main(String []args){
        method2();
        StaticNonStatic staticNonStatic=new StaticNonStatic();
        staticNonStatic.method1();
        int b=staticNonStatic.a;
        System.out.println(b);
        Sample.test2();

    }
    public void method1(){
        System.out.println("one");
    }
    public static void method2(){
        System.out.println("two");
    }
}
