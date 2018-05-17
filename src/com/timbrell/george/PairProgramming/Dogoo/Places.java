package com.timbrell.george.PairProgramming.Dogoo;

import java.util.ArrayList;

public class Places {
    //creating an arraylist of all places, excluding the number the user has selected
    private static ArrayList<Integer> generateList(int total, int place){

        //setting the total places to 100
        int totalPlaces = 100;

        //creating a new arrayList for all of the places
        ArrayList<Integer> places = new ArrayList<Integer>();

        //for loop reading through the array
        for(int i=1; i <= totalPlaces; i++){

            //when the number reaches the palce, continue
            if(i == place){
                //places.add(0)
                continue;
            }
            places.add(i);
        }
        //return the list of places
        return places;
    }



    public static String arrayListToString(ArrayList<String> list){
        //converting the array list to a string so it can be printed out to the console
        String listString ="";
        //setting to the counter to 0
        int counter = 0;
        for (String s : list)
        {
            //adding a space between every place in the array list
            listString += s + " ";

            //creating a new line every 10 places
            if(counter > 0 && (counter % 10== 0)){
                listString +=  "\n";
            }
            //incrementing the counter by 1
         counter++;
        }

        //returning the string of the list
        return listString;
    }

    //adding the suffix to each number
    public static ArrayList<String> addSuffix(ArrayList<Integer> myList){
        ArrayList<String> stringList = new ArrayList<String>(myList.size());

        //for loop to go through the arrayList
        for(int i=0; i < myList.size(); i++){

            int place = myList.get(i);
            //dividing the place by 10 to get the last digit to determine which suffix to use
            int lastDigit = place % 10;

            //only using th for 11, 12 and 13
            if(place == 11|| place == 12 || place == 13){
                stringList.add("" + place + "th" );
                continue;
            }


            //adding the correct suffix for each number
            if(lastDigit == 1){
                stringList.add("" + place + "st" );

            } else if(lastDigit == 2){
                stringList.add("" + place + "nd" );

            }else if(lastDigit == 3) {
                stringList.add("" + place + "rd");
            }else {
                stringList.add("" + place + "th");
            }
        }

        return stringList;

    }


    public static String dog(int place){
        String resultList = "";

        ArrayList myPlaces = generateList(100, place);
        resultList = arrayListToString(addSuffix(myPlaces));
        System.out.println(resultList);


        return resultList;
    }


}
