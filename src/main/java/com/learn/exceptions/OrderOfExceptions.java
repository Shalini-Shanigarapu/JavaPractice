package com.learn.exceptions;

public class OrderOfExceptions {
public static void main(String[] args) {
    try {
        int a = 4 / 0;
        System.out.println(a);
    }
    catch (ArithmeticException ae) {
        System.out.println(ae.toString());
    }

    catch (NullPointerException npe) {

        System.out.println(npe.toString());
        System.out.println("length");
    }

}
    }
