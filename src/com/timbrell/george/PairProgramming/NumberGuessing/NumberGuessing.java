package com.timbrell.george.PairProgramming.NumberGuessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class NumberGuessing {
    private int maxGuess = 10;
    private int minGuess = 0;
    private int currGuess;
    private Random rand = new Random();

    private int getRange(){
        return maxGuess - minGuess;
    }

    public NumberGuessing(){
        currGuess = weightedRandNum(minGuess, maxGuess);
        System.out.println(currGuess);
        System.out.println("Type higher, lower or correct");
    }

    public int myGuess(String diff){
        if(diff.equals("higher")){
            this.minGuess = this.currGuess + 1;

            return 0;
        } else if(diff.equals("lower")) {
            this.maxGuess = this.currGuess - 1;

            return 0;
        } else if(diff.equals("correct")){
            System.out.println("Number correct");
            System.out.println("Play another game? (y/n)");

            return 1;
        } else{
            System.out.println("Invalid input, type 'higher' 'lower' or 'correct'");

            return 3;
        }
    }

    public int weightedRandNum(int min, int max){
        int range = max - min;
        if(range > 0) {
            ArrayList<Integer> intList = new ArrayList<Integer>();
            for (int i = min; i <= max; i++) {
                for (int j = 0; j < i; j++) {
                    intList.add(i);
                }
            }
            return intList.get((int) (Math.random() * intList.size()));
        }else{
            System.out.println("match found! :" + max);
            System.exit(1);
            return max;
        }
    }


    public void nextGuess(){

        currGuess = weightedRandNum(minGuess, maxGuess);
        //currGuess = (int) (Math.random()*((maxGuess-minGuess))+minGuess);
        System.out.println(currGuess);
    }

    public int getCurrGuess() {
        return currGuess;
    }
}
