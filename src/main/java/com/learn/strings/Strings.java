package com.learn.strings;

public class Strings {
    public static void main(String[] args){
        String str="core java";
        String str1=new String("ss");

        System.out.println(str);
        System.out.println(str1);
        String course="java";
       String classes=course.concat(" selenium");
        System.out.println(classes);
        String a = new String();
        String b = new String();
        System.out.println(a==b);//false
        System.out.println(b==a);//false
        System.out.println(b.equals(a));//true
        System.out.println(a.equals(b));//true

       //methods in string comparision
        String s="java";
        String s1="java programs";
        String s2="jira tool";
        String s3="TestNG";
        String s4="testNG";
        String s5="tool";
        String s6="   hooks ";

        System.out.println(s6.trim());//removing the spaces
        System.out.println(s1.contains(s));
        System.out.println(s2.endsWith(s5));
        System.out.println(s4.equalsIgnoreCase(s3));


        //methods in string
        //length
        String b1= " @#Ax456 ";
        System.out.println(b1.length());
        //substring
        String value="12%";
        System.out.println(value.substring(2));
        //regular expression
        String randomdata="8hy#@%AJ12#$";
        System.out.println(randomdata.replaceAll("[a-zA-Z0-9]",""));


    }
}



