package com.learn.Tasks;

public class Fibonacci {
    public static void Fib(int n){
            int a=0,b=1;
            System.out.println("First "+n+" numbers in the Fibonacci sequence are: ");
            for (int i=0;i<n;i++){
                System.out.print(a+" ");
                int c=a+b;
                a=b;
                b=c;
            }
        }
    public static void main(String[] args) {
        int n = 6;
        Fib(n);
    }
}
