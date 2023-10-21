package com.blandygbc.algorithms;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuickSort {
    static Logger logger = Logger.getLogger(QuickSort.class.getName());

    private static void sort(Integer[] arr, int start, int end) {
        int elements = end - start;
        if (elements > 1) {
            int pivotPos = breakPivot(arr, end);
            sort(arr, start, pivotPos);
            sort(arr, pivotPos + 1, end);
        }
    }

    private static int breakPivot(Integer[] arr, int pos) {
        int smallers = 0;
        for (int search = 0; search < pos - 1; search++) {
            if (arr[search] <= arr[pos - 1]) {
                smallers++;
            }
        }
        ArraySwap.swap(arr, pos - 1, smallers);
        return smallers;
    }

    public static void main(String[] args) {
        Integer[] arr1 = { 5, 4, 9, 8, 11, 3, 7, 10, 6 };
        logger.log(Level.INFO, "Original Array 1: {0}", Arrays.toString(arr1));
        sort(arr1, 0, arr1.length);
        logger.log(Level.INFO, "Sorted Array 1: {0}", Arrays.toString(arr1));

    }
}
