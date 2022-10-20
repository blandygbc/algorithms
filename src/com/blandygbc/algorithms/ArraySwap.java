package com.blandygbc.algorithms;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArraySwap {
    static Logger logger = Logger.getLogger(ArraySwap.class.getName());

    public static void swap(Integer[] numbers, Integer firstIndex, Integer secondIndex) {
        int temp = numbers[firstIndex];
        numbers[firstIndex] = numbers[secondIndex];
        numbers[secondIndex] = temp;
    }

    public static void main(String[] args) {
        Integer[] nums = { 7, 9, 4 };
        logger.log(Level.INFO, "Original array: {0}", Arrays.toString(nums));

        swap(nums, 0, 1);
        logger.log(Level.INFO, "Change 0 and 1: {0}", Arrays.toString(nums)); // [9, 7, 4]

        swap(nums, 1, 2);
        logger.log(Level.INFO, "Change 1 and 2: {0}", Arrays.toString(nums)); // [9, 4, 7]

        swap(nums, 2, 0);
        logger.log(Level.INFO, "Change 2 and 0: {0}", Arrays.toString(nums)); // [7, 4, 9]
    }
}
