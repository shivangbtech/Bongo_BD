package com.example.bongobd;

/**
 * 1.Write a function that detects if two strings are anagram
 * e.g. ‘bleat’ and ‘table’ are anagrams but ‘eat’ and ‘tar’ are not.
 */

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String iString1, String iString2) {
        String string1 = iString1.replaceAll("\\s", "");
        String string2 = iString2.replaceAll("\\s", "");
        boolean isAnagram = true;
        if (string1.length() != string2.length()) {
            isAnagram = false;
        } else {
            char[] ArrayS1 = string1.toLowerCase().toCharArray();
            char[] ArrayS2 = string2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            isAnagram = Arrays.equals(ArrayS1, ArrayS2);
        }
        return isAnagram;
    }
}