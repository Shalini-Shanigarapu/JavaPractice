package com.learn.Tasks;

public class Factorial {
    public static int calculate(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int num=4;
        int fact=calculate(num);
        System.out.println("Factorial number is: "+fact);

    }
}
