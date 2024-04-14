package com.learn.Tasks;

public class LargestValue {
    public static void main(String[] args) {
        int[] array={2,15,4,8,16,10};
        int largestValue= array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>largestValue){
                largestValue=array[i];
            }
        }

        System.out.println("Largest value in the array is: " +largestValue);
    }
}

