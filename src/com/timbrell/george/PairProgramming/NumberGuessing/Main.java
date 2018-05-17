package com.timbrell.george.PairProgramming.NumberGuessing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NumberGuessing game1 = new NumberGuessing();
        game1.weightedRandNum(0,100);
        int result;
        String userInput = "";
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            userInput = sc.nextLine();
            result = game1.myGuess(userInput);
            if(result == 0){
                game1.nextGuess();
            } else if(result == 1){
                userInput = sc.nextLine();
                if(userInput.equals("y")){
                    game1 = new NumberGuessing();

                }else {
                    System.exit(1);
                }
            }
        }
    }
}
