package com.blandygbc.algorithms;

import java.util.logging.Logger;

public class BinarySearch {

    static Logger logger = Logger.getLogger(BinarySearch.class.getName());

    public static void findNumberInArray(Integer[] numbers, Integer target) {
        Integer min = 0;
        Integer max = numbers.length - 1;
        Integer mid = 0;
        boolean search = true;
        while (search) {
            mid = (min + max) / 2;
            if (max < min) {
                logger.info("The number " + target + " was not found");
                search = false;
            } else if (numbers[mid].equals(target)) {
                logger.info("The number " + target + " was found at position " + mid);
                search = false;
            } else if (numbers[mid] < target) {
                min = mid + 1;
            } else if (numbers[mid] > target) {
                max = mid - 1;
            }
        }

    }

    public static void main(String[] args) throws Exception {
        Integer[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
                97 };
        findNumberInArray(primes, 5);
    }

}
