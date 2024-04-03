package com.learn.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] a = {{1, 2},
                {3, 4},
                {5, 6}
        };
        for (int i = 0; i < a.length; i++) {
            //int[] b=a[i];
            for (int j = 0; j < a[i].length; j++) {//j<a[i]
                System.out.print(a[i][j] + "  ");//a[i][j]
            }
            System.out.println();

        }
        //overall size of array
        int size = 0;
        for (int i = 0; i < a.length; i++) {
            size += a[i].length;

        }
        System.out.println(size);

        //sum of all the elements

        int[][] a1 = new int[][]{{1, 5, 4}, {8, 7, 2}, {9, 6, 4}};
        int sum = 0;
        for (int i = 0; i < a1.length; i++)

       {
        for (int j = 0; j < a1[i].length; j++) {
            sum += a1[i][j];

        }

    }
        System.out.println(sum);

        //common numbers printing
        int[][] a2 = new int[][]{{1, 5, 4}, {8, 7, 5}, {9, 6, 8}};
        int[][] b1 = new int[][]{{1, 5, 7}, {2, 7, 4}, {9, 2, 1}};
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < b1.length; j++) {
                if (a2[i][j] == b1[i][j]) {
                    System.out.println(a2[i][j]);
                }

            }

        }
        //Interchange the values
        int[][] arr = new int[][]{{1, 2, 3}, {3, 4, 5}, {4, 2, 2}};
        System.out.println("original matrix");
        displayMatrix(arr);
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
                System.out.print("transposed matrix :");
                displayMatrix(arr);

            }

        public static void displayMatrix(int[][] arr){
            for (int[] row : arr) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }

}