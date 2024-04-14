package com.learn.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecoundHightestValue {
    public static void main(String[] args) {
        int[] array={6,3,4,8,1,9};
        Arrays.sort(array);
        int SH=array[array.length-2];
        System.out.println("Secound Hightest Value:" +SH);
    }
}
