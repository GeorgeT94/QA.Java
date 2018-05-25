package com.timbrell.george.level3.Strings;

public class String {
    public void longestSubStr(String str1, String str2) {
        String longStr;
        String shortStr;
        String subSequence;

        if (str1.toString().length() > str2.toString().length()){
            longStr = str1;
            shortStr = str2;
        }else{
            longStr = str2;
            shortStr = str1;
        }


    }
}

