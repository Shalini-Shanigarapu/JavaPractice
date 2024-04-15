package com.learn.Tasks.SortingAlgorithms;
import java.util.ArrayList;
import java.util.Collections;

public class MergeSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(16);
        list.add(15);
        list.add(1);
        mergeSort(list);
        System.out.println("Sorted list:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
    public static void mergeSort(ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return;
        }
        int mid = list.size() / 2;
        ArrayList<Integer> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(list.subList(mid, list.size()));
        mergeSort(left);
        mergeSort(right);
        merge(list, left, right);
    }
    public static void merge(ArrayList<Integer> list, ArrayList<Integer> left, ArrayList<Integer> right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int listIndex = 0;
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) < right.get(rightIndex)) {
                list.set(listIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                list.set(listIndex, right.get(rightIndex));
                rightIndex++;
            }
            listIndex++;
        }
        while (leftIndex < left.size()) {
            list.set(listIndex, left.get(leftIndex));
            leftIndex++;
            listIndex++;
        }

        while (rightIndex < right.size()) {
            list.set(listIndex, right.get(rightIndex));
            rightIndex++;
            listIndex++;
        }
    }

}

