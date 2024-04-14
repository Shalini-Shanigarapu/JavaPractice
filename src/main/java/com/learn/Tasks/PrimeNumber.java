package com.learn.Tasks;

public class PrimeNumber {
    public static void main(String[] args) {
        int a=10,i,count=0;
        for(i=1;i<a;i++){
            if(a%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("Prime number");
        }else
            System.out.println("Not a prime number");
    }
}
