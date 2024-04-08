package com.learn.Collections;

import java.util.*;

public class StackPractice {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.search(1));
        System.out.println(s.indexOf(2));
        System.out.println(s.size());
        System.out.println(s.capacity());
    }
}
