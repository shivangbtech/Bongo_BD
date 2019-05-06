package com.example.bongobd;

import org.junit.Test;

public class AnagramTest {

//    private String mInputFirst = "bleat";
//    private String mInputSecond = "table";

    private String mInputFirst = "eat";
    private String mInputSecond = "tar";

    @Test
    public void isAnagramOrNot() {
        Anagram anagram = new Anagram();
        Boolean result = anagram.isAnagram(mInputFirst, mInputSecond);
        if (result) {
            System.out.println(mInputFirst + " and " + mInputSecond + " are Anagram");
        } else {
            System.out.println(mInputFirst + " and " + mInputSecond + " are not Anagram");
        }
    }

    @Test
    public void isInputValid() {
        if (mInputFirst != null && mInputSecond != null) {
            System.out.println("Yah...! Inputs are valid!");
        } else {
            System.out.println("Ohh...! Inputs are not valid!");
        }
    }
}
