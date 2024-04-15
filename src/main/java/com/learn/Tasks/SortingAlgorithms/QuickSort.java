package com.learn.Tasks.SortingAlgorithms;
import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(1);
        list.add(9);
        list.add(2);
        list.add(19);
        quickSort(list, 0, list.size() - 1);
        System.out.println("Quick Sorted list:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
    public static void quickSort(List<Integer> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }
    public static int partition(List<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (list.get(j) <= pivot) {
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i + 1, high);

        return i + 1;
    }
    public static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
