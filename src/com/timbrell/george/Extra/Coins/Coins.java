package com.timbrell.george.Extra.Coins;

import java.util.ArrayList;
import java.util.Arrays;

public class Coins {
    Parser parser = new Parser();
    public  ArrayList<Integer> getLeastCoins(double total, String[] strArray){
        int[] intArry = parser.parseCoins(strArray);
        return getLeastCoins(total, intArry);
    }
    public ArrayList<Integer> getLeastCoins(double total, int[] coinOptions){
        Arrays.sort(coinOptions);
        int totalPennies = (int)(total*100);
        ArrayList<Integer> returnCoins = new ArrayList<Integer>();

        for(int i= coinOptions.length-1; i >=0; i-- ){
            if(totalPennies == 0){
                System.out.println("combination found: " + returnCoins.toString());
                return returnCoins;
            }
            if(reduceByCoin(totalPennies, coinOptions[i], coinOptions[0] , coinOptions)){
                totalPennies -= coinOptions[i];
                returnCoins.add(coinOptions[i]);
                i = coinOptions.length-1;
            }
        }
        if(totalPennies > 0){
            coinOptions = Arrays.copyOf(coinOptions, coinOptions.length-1);
            if(coinOptions.length == 0){
                System.out.println("Impossible combination");
                return null;
            }
            returnCoins.clear();
            getLeastCoins(total, coinOptions);
        }else{
            return returnCoins;

        }
        return returnCoins;

    }

    private boolean canBeMade(int total, int[] choices){
        for(int i=0; i< choices.length; i++){
            if((total % choices[i] )== 0)
                return true;
        }
        return false;
    }

    public boolean reduceByCoin(int total, int coin, int lowestCoin ,int[] choices){
        if(((total - coin == 0) || ((total - coin) >= lowestCoin)) && canBeMade((total-coin), choices) ){
            return true;
        }
        return false;
    }

}
