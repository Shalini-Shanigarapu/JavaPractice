package com.learn.throwandthrows;

public class ThrowExceptionExample {
    public static void main(String[] args){
        try{
            throw new Sample(" This is custom Exception");
        }catch(Sample th){
            th.printStackTrace();
            System.out.println("Catch that Exception");
        }
    }
}
