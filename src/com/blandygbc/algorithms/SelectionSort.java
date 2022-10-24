package com.blandygbc.algorithms;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SelectionSort {
    static Logger logger = Logger.getLogger(SelectionSort.class.getName());

    public static void selectionSort(Integer[] array) {
        Integer minIndex = 0;
        for (var i = 0; i < array.length; i++) {
            // Get the smallest number index in the array
            minIndex = MinimumArrayValue.indexOfMinimum(array, i);
            // swap with the actual number
            ArraySwap.swap(array, i, minIndex);
        }
    }

    public static void main(String[] args) {
        Integer[] nums1 = { 22, 11, 99, 88, 9, 7, 42 };
        logger.log(Level.INFO, "Original array1: {0}", Arrays.toString(nums1));
        selectionSort(nums1);
        logger.log(Level.INFO, "Array1 after sorting: {0}",
                Arrays.toString(nums1)); // [7, 9, 11, 22, 42, 88, 99]

        Integer[] nums2 = { 22, 11, 0, 8, 9, -7, 2 };
        logger.log(Level.INFO, "Original array2: {0}", Arrays.toString(nums2));
        selectionSort(nums2);
        logger.log(Level.INFO, "Array2 after sorting: {0}",
                Arrays.toString(nums2)); // [-7, 0, 2, 8, 9, 11, 22]
    }
}
