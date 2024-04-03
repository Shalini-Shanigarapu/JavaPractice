package com.learn.throwandthrows;

public class ThrowException {
    public static void main(String[] args){
        int num = -1;
        try {
            if (num < 0) {
                throw new IllegalArgumentException("Number cannot be Negative");
            }
        }
            catch(IllegalArgumentException iae){
                System.out.println("Caugth Exception");
                throw new IllegalArgumentException("negative number");

            }
        System.out.println("shalini");
        }
    }

