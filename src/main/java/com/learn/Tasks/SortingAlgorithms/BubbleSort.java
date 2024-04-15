package com.learn.Tasks.SortingAlgorithms;
import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(3);
        list.add(8);
        list.add(12);
        list.add(9);
        bubbleSort(list);
        System.out.println("Sorted list:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
    public static void bubbleSort(ArrayList<Integer> list) {
        int num = list.size();
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }
    }
}


