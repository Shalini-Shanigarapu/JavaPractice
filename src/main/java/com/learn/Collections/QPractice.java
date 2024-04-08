package com.learn.Collections;

import java.util.*;

public class QPractice {
    public static void main(String[] args) {
        Queue<String> p = new PriorityQueue<>(Comparator.reverseOrder());
//offer or add
        p.offer("b");
        p.add("d");
        p.offer("c");
        System.out.println(p);
//peek
        System.out.println(p.peek());
        //poll or remove
        p.poll();
        System.out.println(p);
        while (!p.isEmpty()){
            System.out.println(p.remove());
        }
    }
}
