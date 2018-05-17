package com.timbrell.george.level3;

public class Primes{

    public static boolean isPrime(int num){

        int[] primeList = new int[1000];
        primeList[0] = 2;
        int highestIndex = 1;
        for(int i = 0; i < highestIndex; i++ ){
            if(highestIndex > primeList.length){
                System.out.println("array not big enough");
                break;
            }
            if(num % primeList[i] == 0) {
                primeList[highestIndex] = num;
                highestIndex++;
                return false;

            }
        }
        return true;
    }

    public static int primeGen(int highestNum){
        int numberOfPrimes = 0;
        for(int i = 0; i < highestNum; i++){
            if(isPrime(i)){
                System.out.println(i);
                numberOfPrimes++;
            }
        }
        return numberOfPrimes;
    }

    public static void main(String[] args) {
        int[] primeList = new int[1000000];
        primeList[0] = 2;
        //System.out.print(primeList[1]);
        System.out.println(primeGen(2000000000));
    }
}
