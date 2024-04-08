package com.learn.Collections;

public class Guser {
    public static void main(String[] args) {
        GPractice<Integer> generic = new GPractice<>();
        System.out.println(generic.isEquals(1,1));

        GPractice<String> generic1 = new GPractice<>();
        System.out.println(generic1.isEquals("Shalini","Shalini"));

        GPractice<Double> generic2 = new GPractice<>();
        System.out.println(generic2.isEquals(2.3d,4.5d));





    }

}
