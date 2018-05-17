package com.timbrell.george.exercise2.BlackJack;

import com.sun.org.apache.xpath.internal.SourceTree;

public class BlackJack {
    public static int highestNotBust(int card1,int card2) {
        int limit = 21;

        card1 = (card1 > limit || card1 < 0 ) ? 0 : card1;
        card2 = (card2 > limit ) ? 0 : card2;

        return  (card1 < card2) ? card2 : card1;

    }

}
