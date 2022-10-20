package com.blandygbc.algorithms;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MinimumArrayValue {
    static Logger logger = Logger.getLogger(MinimumArrayValue.class.getName());

    public static Integer indexOfMinimum(Integer[] numbers, Integer startIndex) {
        // Set initial values for minValue and minIndex,
        // based on the leftmost entry in the subarray:
        Integer minValue = numbers[startIndex];
        Integer minIndex = startIndex;

        // Loop over items starting with startIndex,
        // updating minValue and minIndex as needed:
        for (int i = minIndex + 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minIndex = i;
                minValue = numbers[i];
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        Integer[] nums = { 18, 6, 66, 44, 9, 22, 14 };
        logger.log(Level.INFO, "Array: {0}", Arrays.toString(nums));
        /*
         * For the test array [18, 6, 66, 44, 9, 22, 14],
         * the value 9 is the smallest of [..66, 44, 9, 22, 14]
         * Since 9 is at index 4 in the original array,
         * "index" has value 4
         */
        logger.log(Level.INFO, "The index of the minimum value of the subarray starting at index 2 is: {0}",
                indexOfMinimum(nums, 2));
        // And starting from 0 is 1
        logger.log(Level.INFO, "The index of the minimum value of the subarray starting at index 0 is: {0}",
                indexOfMinimum(nums, 0));
        logger.log(Level.INFO, "The index of the minimum value of the subarray starting at index 5 is: {0}",
                indexOfMinimum(nums, 5)); // 6
    }
}
