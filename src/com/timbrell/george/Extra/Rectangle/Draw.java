package com.timbrell.george.Extra.Rectangle;

public class Draw {
    public void rectangle(String word, int x, int y){
        word = word.toUpperCase();
        for(int j = 0; j < y; j++){
            if(j % 2 == 0){
                evenLine(word , x);
                evenColumns(word, x);
            }
            if(j%2 == 1){
                oddLine(word, x);
                oddColumns(word, x);
            }
        }
        oddLine(word, x );

    }

    public void evenColumns(String word,int x){
        System.out.println();
        for(int i = 1; i < word.length() -1 ; i++){
            printRow(word, i, x);
        }
    }

    public void oddColumns(String word,int x){
        System.out.println();
        for(int i = 1; i < word.length() -1 ; i++){
            word = reverseString(word);
            printRow(word, i, x);
            word = reverseString(word);
        }
    }
    public void printRow(String word,int rowNum, int x){
        String returnStr =  "";
        int columnNumber = 0;
        for(int i =0; i < (word.length() + (x-1)*(word.length() -1 )); i++) {
            if(i % (word.length() - 1) != 0){
                returnStr += " ";
            }else {
                if(columnNumber % 2 == 0){
                    returnStr += word.charAt(rowNum);
                    columnNumber++;
                }else{
                    returnStr += reverseString(word).charAt(rowNum);
                    columnNumber++;
                }
            }


        }
        System.out.println(returnStr);
    }

    public void oddLine(String word, int x){
        for(int i = 0; i < x; i++){
            if(i==0) System.out.print(reverseString(word));
            else if(i%2 == 0){
                word = reverseString(word);
                System.out.print(word.substring(1, word.length()));
                word = reverseString(word);
            }
            else if(i%2 == 1){
                System.out.print(word.substring(1, word.length()));
            }


        }
    }
    public void evenLine(String word, int x){
        for(int i = 0; i < x; i++){
            if(i==0) System.out.print(word);
            else if(i%2 == 1){
                word = reverseString(word);
                System.out.print(word.substring(1, word.length()));
                word = reverseString(word);
            }
            else if(i%2 == 0){
                System.out.print(word.substring(1, word.length()));
            }


        }
    }

    public String reverseString(String str){
        return new StringBuilder(str).reverse().toString();

    }

}
