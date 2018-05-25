package com.timbrell.george.level3.Hashmaps;

import java.util.Arrays;

public class Sorter {
    public String sort(String string){

        char tempArray[] = string.toCharArray();

        Arrays.sort(tempArray);

        return new String(tempArray);
    }
}
