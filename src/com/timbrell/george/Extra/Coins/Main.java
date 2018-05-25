package com.timbrell.george.Extra.Coins;

public class Main {

    public static void main(String[] args) {
        Coins coin = new Coins();
        Parser parser = new Parser();
        int[] choices = new int[]{5, 3};
        String[] strChoices = new String[]{"£2", "9p", "2p","3p","13p"};
        coin.getLeastCoins(0.42, choices).toString();
    }

}
