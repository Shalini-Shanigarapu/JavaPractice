package com.learn.throwandthrows;

public class Division {
    public static void main(String[] args) {
        try
        {
            divide(10,0);
        }catch(ArithmeticException ae){
            System.out.println("Caught ArthimeticException:" + ae.getMessage());
            throw ae;
        }
        System.out.println("shalini");
    }

    public static void divide(int a,int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Cannot be Divided by zero");
        }
        int c = a/b;
        System.out.println("Result:"+c);
    }

}
