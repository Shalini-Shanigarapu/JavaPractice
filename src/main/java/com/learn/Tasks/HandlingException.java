package com.learn.Tasks;

public class HandlingException {
    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3, 4};
            System.out.println(numbers[5]);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Exception: "+exception.getMessage());
        }
    }
}
