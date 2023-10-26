package com.blandygbc.algorithms;

import java.util.logging.Level;
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

    public static Integer search(Integer[] numbers, Integer from, Integer to, Integer target) {
        if (from > to) {
            return -1;
        }
        Integer mid = (from + to) / 2;
        if (numbers[mid].equals(target)) {
            return mid;
        }
        if (target < numbers[mid]) {
            return search(numbers, from, mid - 1, target);
        }
        return search(numbers, mid + 1, to, target);
    }

    public static void main(String[] args) {
        Integer[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
                97 };

        Integer target = 67;
        String result = findNumberInArray(primes, target);
        logger.info(result);

        target = 12;
        int to = primes.length - 1;
        Integer searchResult = search(primes, 0, to, target);
        logResult(target, searchResult);

        target = 2;
        searchResult = search(primes, 0, to, target);
        logResult(target, searchResult);

        target = 97;
        searchResult = search(primes, 0, to, target);
        logResult(target, searchResult);
    }

    private static void logResult(Integer target, Integer searchResult) {
        if (searchResult >= 0) {
            logger.log(
                    Level.INFO,
                    "The target number {0} was found at index: {1}.",
                    new Integer[] { target, searchResult });
        } else {
            logger.log(
                    Level.INFO,
                    "The target number {0} was not found.",
                    target);
        }
    }

}
