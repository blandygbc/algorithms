package com.blandygbc.algorithms;

import java.util.logging.Logger;

public class BinarySearch {

    static Logger logger = Logger.getLogger(BinarySearch.class.getName());

    public static String findNumberInArray(Integer[] numbers, Integer target) {
        Integer min = 0;
        Integer max = numbers.length - 1;
        Integer mid = 0;
        StringBuilder stringBuilder = new StringBuilder("The number " + target);
        while (max > min) {
            // Get the middle index
            mid = (min + max) / 2;
            if (numbers[mid].equals(target)) {
                return stringBuilder.append(" was found at index " + mid).toString();
            } else if (numbers[mid] < target) {
                // if the actual number in array is smaller than the target
                // set the mid+1 to the min index
                min = mid + 1;
            } else if (numbers[mid] > target) {
                // if the actual number in array is bigger than the target
                // set the mid-1 to the max index
                max = mid - 1;
            }
        }
        return stringBuilder.append(" was not found").toString();
    }

    public static void main(String[] args) {
        Integer[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
                97 };
        String result = findNumberInArray(primes, 67);
        logger.info(result);
    }

}
