package com.learn.Tasks;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] array={2,4,5,3,2,4,3,6};
        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicateNumbers = new HashSet<>();
        for(int number:array){
            if(uniqueNumbers.contains(number)){
                duplicateNumbers.add(number);
            }else{
                uniqueNumbers.add(number);
            }
        }
        System.out.println("Duplicate Numbers: "+duplicateNumbers);
        //System.out.println(uniqueNumbers);
    }
}
