package com.learn.Tasks;

public class Matrix {

//Addition of two matrices
    public static void addition() {
        int[][] arr1 = new int[][]{{1, 2, 1}, {9, 7, 2}, {7, 6, 4}};
        int[][] arr2 = new int[][]{{2, 6, 8}, {0, 1, 3}, {1, 2, 4}};
        int[][] arr3 = new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void multipication() {
        int[][] arr1 = new int[][]{{4, 3, 1}, {9, 8, 2}, {8, 6, 4}};
        int[][] arr2 = new int[][]{{3, 6, 8}, {6, 5, 3}, {9, 2, 4}};
        int[][] arr3 = new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr3[i][j] = arr1[i][j] * arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void transpose() {
        int[][] arr1 = new int[][]{{1, 8, 4}, {9, 7, 2}, {7, 6, 4}};
        int[][] arr2 = new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr2[i][j] = arr1[j][i];
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void matrix() {
        int[][] arr = new int[][]{{1, 2, 1}, {9, 7, 2}, {7, 6, 4}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        addition();
        System.out.println("******************");
        multipication();
        System.out.println("******************");
        transpose();
        System.out.println("******************");
        matrix();

    }

}




