package com.learn.Tasks;

public class Matrix {
    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 2, 1 }, { 9, 7, 2 },{7,6,4} };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

