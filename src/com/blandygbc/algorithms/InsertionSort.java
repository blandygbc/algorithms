package com.blandygbc.algorithms;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertionSort {
    static Logger logger = Logger.getLogger(InsertionSort.class.getName());

    public static void insertionSort(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            InsertInArray.insert(array, i, array[i + 1]);
        }
    }

    public static void main(String[] args) {
        Integer[] nums1 = { 22, 11, 99, 88, 9, 7, 42 };
        logger.log(Level.INFO, "Original array: {0}", Arrays.toString(nums1));
        insertionSort(nums1);
        logger.log(Level.INFO, "Array1 after sorting 1: {0}",
                Arrays.toString(nums1)); // [7, 9, 11, 22, 42, 88, 99]

        Integer[] nums2 = { -2, 11, 99, 0, 9, 7, 42 };
        logger.log(Level.INFO, "Original array2: {0}", Arrays.toString(nums2));
        insertionSort(nums2);
        logger.log(Level.INFO, "Array2 after sorting 2: {0}",
                Arrays.toString(nums2)); // [-2, 0, 7, 9, 11, 42, 99]
    }
}
