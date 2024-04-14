package com.learn.Arrays;



public class HightestValues {
    public static void main(String[] args) {
            int[] array={2,16,4,8,10};
            int high= array[0];
            for(int i=1;i<array.length;i++){
                if(array[i]>high){
                    high=array[i];
                }
            }

            System.out.println("Hightest value in the array is:" +high);
    }
}
