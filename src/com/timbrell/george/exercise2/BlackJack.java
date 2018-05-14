package com.timbrell.george.exercise2;

import com.sun.org.apache.xpath.internal.SourceTree;

public class BlackJack {
    public static int highestNotBust(int card1,int card2) {
        int limit = 21;
        if(card1 <= 0 || card2 <= 0){
            System.out.println("cards must be greater than 0");
            return 0;
        }

        if (card1 > limit && card2 > limit) {
            return 0;
        }

        if (card1 > 21) {
            return card2;
        }
        if (card2 > 21) {
            return card1;
        }

        if (card1 > card2) {
            return card1;
        } else {
            return card2;
        }
    }

    //Given 3 integer values, return their sum.
    // If one value is the same as another value,
    //they do not count towards the sum.
    public static int uniqueSum(int num1, int num2, int num3){
        int sum = 0;
        if(num2 != num1)
            sum += num2;
        if(num3 != num1 && num3 != num2)
            sum += num3;

        if(num3 != num1 && num1 != num2)
            sum += num1;

        return sum;
    }

    public static void testHighestNotBust(){
        System.out.println("0, 0 =>" + highestNotBust(0,0));
        System.out.println("22, 21 =>" + highestNotBust(22,21));
        System.out.println("20, 25 =>" + highestNotBust(20,25));
        System.out.println("20,17 =>" + highestNotBust(20,17));


    }

    public static void testUniqueSum(){
        System.out.println("0, 0, 0 =>" + uniqueSum(0,0,0));
        System.out.println("1, 2, 3 =>" + uniqueSum(1,2,3));
        System.out.println("3, 3, 3 =>" + uniqueSum(3,3,3));
        System.out.println("10, 10, 1 =>" + uniqueSum(10,10,1));
        System.out.println("99, 12, 2 =>" + uniqueSum(99,12,2));
    }

    public static void main(String[] args) {
        //testHighestNotBust();
        //testUniqueSum();

    }
}
