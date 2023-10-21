package com.blandygbc.algorithms;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MergeSort {
    static Logger logger = Logger.getLogger(MergeSort.class.getName());

    private static void sort(Integer[] arr1, int start, int end) {
        int size = end - start;
        if (size > 1) {
            int mid = (start + end) / 2;
            sort(arr1, start, mid);
            sort(arr1, mid, end);
            merge(arr1, start, mid, end);
        }
    }

    public static Integer[] mergeArrays(Integer[] arr1, Integer[] arr2) {
        Integer[] result = new Integer[arr1.length + arr2.length];
        int count1 = 0;
        int count2 = 0;
        int current = 0;
        while (count1 < arr1.length
                && count2 < arr2.length) {
            if (arr1[count1] < arr2[count2]) {
                result[current++] = arr1[count1++];
            } else {
                result[current++] = arr2[count2++];
            }
        }
        while (count1 < arr1.length) {
            result[current++] = arr1[count1++];
        }
        while (count2 < arr2.length) {
            result[current++] = arr2[count2++];
        }
        return result;
    }

    public static void merge(Integer[] arr, int start, int mid, int end) {
        Integer[] temp = new Integer[end - start];
        int count1 = start;
        int count2 = mid;
        int current = 0;
        while (count1 < mid
                && count2 < end) {
            if (arr[count1] < arr[count2]) {
                temp[current++] = arr[count1++];
            } else {
                temp[current++] = arr[count2++];
            }
        }
        while (count1 < mid) {
            temp[current++] = arr[count1++];
        }
        while (count2 < end) {
            temp[current++] = arr[count2++];
        }
        for (int i = 0; i < current; i++) {
            arr[start + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Integer[] arr1 = { 5, 4, 9, 8 };
        logger.log(Level.INFO, "Original Array 1: {0}", Arrays.toString(arr1));
        Integer[] arr2 = { 11, 3, 7, 10, 6 };
        logger.log(Level.INFO, "Original Array 2: {0}", Arrays.toString(arr2));
        sort(arr1, 0, arr1.length);
        logger.log(Level.INFO, "Sorted Array 1: {0}", Arrays.toString(arr1));
        sort(arr2, 0, arr2.length);
        logger.log(Level.INFO, "Sorted Array 2: {0}", Arrays.toString(arr2));

        Integer[] result = mergeArrays(arr1, arr2);
        logger.log(Level.INFO, "Arrays 1 and 2 merged: {0}", Arrays.toString(result));

    }
}
