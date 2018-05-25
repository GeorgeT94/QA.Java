package com.timbrell.george.level3.Primes2;

import java.util.ArrayList;
import java.util.stream.IntStream;


public class Primes{
    public static boolean isPrime(int num){
        for(int i = 2; i < Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static int primeGen(int highestNum){
        int numberOfPrimes = 1;
        System.out.println(2);
        for(int i = 3; i < highestNum; i+=2){
            if(isPrime(i)){
                System.out.println(i);
                numberOfPrimes++;
            }
        }
        return numberOfPrimes;
    }

    public static void main(String[] args) {
        System.out.println(primeGen(2000000));
    }
}
