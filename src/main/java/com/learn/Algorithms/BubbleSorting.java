package com.learn.Algorithms;

public class BubbleSorting {

    public static void bubblesort(){
        int[] array = {6,4,8,3};
        int n = array.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("Bubble sorted array:");
        for(int number:array){
            System.out.print(number+" ");
        }
    }
    public static void main(String[] args) {
        bubblesort();

    }



}
