package com.blandygbc.algorithms;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertInArray {
    static Logger logger = Logger.getLogger(InsertInArray.class.getName());

    public static void insert(Integer[] array, int rightIndex, int value) {
        int i;
        for (i = rightIndex; i >= 0 && array[i] > value; i--) {
            array[i + 1] = array[i];
        }
        array[i + 1] = value;
    }

    public static void main(String[] args) {
        Integer[] nums = { 3, 5, 7, 11, 13, 2, 9, 6 };
        logger.log(Level.INFO, "Original array: {0}", Arrays.toString(nums));

        insert(nums, 4, 2);
        logger.log(Level.INFO, "Array1 after inserting 2: {0}",
                Arrays.toString(nums)); // [2, 3, 5, 7, 11, 13, 9, 6]

        insert(nums, 5, 9);
        logger.log(Level.INFO, "Array1 after inserting 9: {0}",
                Arrays.toString(nums)); // [2, 3, 5, 7, 9, 11, 13, 6]

        insert(nums, 6, 6);
        logger.log(Level.INFO, "Array1 after inserting 6: {0}",
                Arrays.toString(nums)); // [2, 3, 5, 6, 7, 9, 11, 13]
    }
}
