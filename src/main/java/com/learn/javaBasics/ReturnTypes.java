package com.learn.javaBasics;

public class ReturnTypes {
    public static void main(String [] args){
        ReturnTypes returnTypes=new ReturnTypes();
        System.out.println(returnTypes.name("shalu"));
        System.out.println(returnTypes.one());
        System.out.println(returnTypes.sum(1,2));
        returnTypes.method();
    }
    public int one(){
        return 1;

    }
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b,int c){
        return a+b+c;
    }
    public String name(String str){
        return str;
    }
    public void method(){
        System.out.println("shalini");
    }
}
