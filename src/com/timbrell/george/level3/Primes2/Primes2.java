package com.timbrell.george.level3.Primes2;


public class Primes2{

    public static boolean isPrime(int num){
        for(int i = 3; i < Math.sqrt(num); i+=2){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static int primeGen(int highestNum){
        int numberOfPrimes = 1;
        System.out.println(2);
        for(int i = 0; i < highestNum; i++){
            if(isPrime(i)){
                System.out.println(i);
                numberOfPrimes++;
            }
        }
        return numberOfPrimes;
    }

    public static int[] generateArray(int size){
        int[] resultArr = new int[size];
        for(int i = 0; i < resultArr.length; i++){
            resultArr[i] = i+1;
        }
        return resultArr;
    }

    public static void removeFactors(int[] intArr){
        int[] arrClone = intArr.clone();
        for(int i = 1; i < Math.sqrt(intArr.length); i++){
            for(int j= 2*arrClone[i]  -1 ; j <= (intArr.length) -1; j += arrClone[i]){
                intArr[j] = 0;
            }
        }
        System.out.println("done");
    }
    public static void printNonZero(int[] intArr){
        for(int i = 0; i< intArr.length; i++){
            if(intArr[i] != 0) System.out.println(intArr[i]);
        }
    }
    public static void main(String[] args) {
        int[] primeArray;
        primeArray = generateArray(100000000);
        //printNonZero(primeArray);
        removeFactors(primeArray);
        //printNonZero(primeArray);
    }
}