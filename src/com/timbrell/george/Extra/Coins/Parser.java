package com.timbrell.george.Extra.Coins;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public int[] parseCoins(String[] coinArr){
        int[] coinList = new int[coinArr.length];
        for(int i = 0; i < coinList.length; i++){
            coinList[i] = parseCoin(coinArr[i]);
        }
        System.out.println(Arrays.toString(coinList));
        return coinList;
    }

    public int parseCoin(String coin){
        int coinInt;
        if(coin.contains("£")){
            Matcher matcher = Pattern.compile("\\d+").matcher(coin);
            matcher.find();
            coinInt = Integer.valueOf(matcher.group())*100;
            return coinInt;
        }
        if(coin.contains("p")){
            Matcher matcher = Pattern.compile("\\d+").matcher(coin);
            matcher.find();
            coinInt = Integer.valueOf(matcher.group());
            return coinInt;
        }

        return 0;
    }
}
