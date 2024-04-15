package com.learn.Tasks.SortingAlgorithms;
import java.util.ArrayList;
import java.util.List;
public class BinarySearch {

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(4);
            list.add(9);
            list.add(6);
            list.add(8);
            list.add(10);
            list.add(12);
            int SearchNumber = 8;
            int index = binarySearch(list, SearchNumber);
            if (index != -1) {
                System.out.println("Element " + SearchNumber + " found at index " + index);
            } else {
                System.out.println("Element " + SearchNumber + " not found in the list");
            }
        }

        public static int binarySearch(List<Integer> list, int SearchNumber) {
            int left = 0;
            int right = list.size() - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (list.get(mid) == SearchNumber) {
                    return mid;
                } else if (list.get(mid) < SearchNumber) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return -1;
        }
    }

