package com.newproject.importantmethods;

import com.google.common.base.CharMatcher;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UseCharMatcherExtractDigitNumber {
    public static void main(String[] args) {
        String s = " 約 1,440,000,000 件 （0.55 秒）";
        long DigitsNumber = Long.parseLong(CharMatcher.digit().retainFrom
                (s.replace("（0.55 秒）", "")));
        System.out.println(DigitsNumber);
    }
}
