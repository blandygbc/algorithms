package com.blandygbc.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RomanToInteger {

    static Logger logger = Logger.getLogger(RomanToInteger.class.getName());

    public static int romanToInt(String s) {
        Map<String, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put("I", 1);
        romanNumerals.put("IV", 4);
        romanNumerals.put("V", 5);
        romanNumerals.put("IX", 9);
        romanNumerals.put("X", 10);
        romanNumerals.put("XL", 40);
        romanNumerals.put("L", 50);
        romanNumerals.put("XC", 90);
        romanNumerals.put("C", 100);
        romanNumerals.put("CD", 400);
        romanNumerals.put("D", 500);
        romanNumerals.put("CM", 900);
        romanNumerals.put("M", 1000);
        int result = 0;
        List<String> letters = Arrays.asList(s.split(""));
        for (int i = 0; i < letters.size(); i++) {
            if ((i + 1) <= (letters.size() - 1) && romanNumerals.containsKey(letters.get(i) + letters.get(i + 1))) {
                result += romanNumerals.get(letters.get(i) + letters.get(i + 1));
                i++;
            } else {
                result += romanNumerals.get(letters.get(i));
            }
        }
        return result;
    }

    public static int romanToInt2(String s) {
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i + 1) <= (s.length() - 1) && romanNumerals.get(s.charAt(i)) < romanNumerals.get(s.charAt(i + 1))) {
                result -= romanNumerals.get(s.charAt(i));
            } else {
                result += romanNumerals.get(s.charAt(i));
            }
        }
        return result;
    }

    public static Integer getRomanNumeralValue(char numeral) {
        switch (numeral) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static Integer romanToInt3(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i + 1) <= (s.length() - 1)
                    && getRomanNumeralValue(s.charAt(i)) < getRomanNumeralValue(s.charAt(i + 1))) {
                result -= getRomanNumeralValue(s.charAt(i));
            } else {
                result += getRomanNumeralValue(s.charAt(i));
            }
        }
        return result;
    }

    static final String ROMAN_NUMBER = "MCMXCIV";

    public static void main(String[] args) {
        logger.log(Level.INFO, "The MCMXCIV in first method: {0}", romanToInt(ROMAN_NUMBER));
        logger.log(Level.INFO, "The MCMXCIV in second method: {0}", romanToInt2(ROMAN_NUMBER));
        logger.log(Level.INFO, "The MCMXCIV in third method: {0}", romanToInt3(ROMAN_NUMBER));
    }
}
