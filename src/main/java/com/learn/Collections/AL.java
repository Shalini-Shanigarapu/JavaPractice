package com.learn.Collections;

import java.lang.reflect.Array;
import java.util.*;

public class AL {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1,2,3};
        List<Object> al = new ArrayList<>(Arrays.asList(arr));
        al.add("s1");
        al.add("s2");
        al.add("s3");
        System.out.println(al);

        ArrayList<Object> al1 = new ArrayList<>(8);
        al1.add("r1");
        al1.add("r2");
        al1.add("r3");
        System.out.println(al1);
        System.out.println(al1.size());
        System.out.println(al.size());
        al.addAll(al1);
        System.out.println(al);
        al.set(1,2);
        System.out.println(al);
al.remove(1);
        System.out.println(al);
al.clear();
        System.out.println(al);
        al.addAll(al1);
        System.out.println(al);
        System.out.println(al.get(2));




    }

}
