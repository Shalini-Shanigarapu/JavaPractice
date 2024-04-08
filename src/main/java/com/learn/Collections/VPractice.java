package com.learn.Collections;

import java.util.*;

public class VPractice {
    public static void main(String[] args) {
        Vector<Object> v1 = new Vector<>();
        v1.add(1);
        v1.add(2);
        v1.add("Java");
        System.out.println(v1);
        Vector<Object> v2 = new Vector<>();
        v2.add("Chocolate");
        v2.add("Shalini");

        System.out.println(v2);
        System.out.println(v1.addAll(v2));
        v1.set(2,"Selenium");
        System.out.println(v1);
        System.out.println(v2.size());
        System.out.println(v1.capacity());
        System.out.println(v1.indexOf("Chocolate"));
        v1.remove(1);
        System.out.println(v1);
        System.out.println(v1.get(2));
        //System.out.println(v1.getFirst());


    }

}
