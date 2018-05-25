package com.timbrell.george.level3.Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Hash {
    public HashMap<String, ArrayList<String>> stringArrayToHashBySorted(ArrayList<String> strList){
        HashMap<String, ArrayList<String>> hashBySorted = new HashMap<>();
        Sorter sorter = new Sorter();

        for(String word: strList){
            String sortedWord = sorter.sort(word);
            ArrayList<String> anagramList = new ArrayList<String>();
            if(hashBySorted.get(sortedWord) != null){
                anagramList = hashBySorted.get(sortedWord);

            }

            anagramList.add(word);
            hashBySorted.put(sortedWord, anagramList);
        }
        return hashBySorted;
    }

    public ArrayList<String> mostAnagrams(HashMap<String, ArrayList<String>> wordHash){
            ArrayList<String> mostAnagrams = new ArrayList<String>();
            int currentHighest = 0;

            ArrayList<String> currentList;

                Iterator it = wordHash.entrySet().iterator();
            while (it.hasNext()) {
                HashMap.Entry pair = (HashMap.Entry)it.next();
                currentList = wordHash.get(pair.getKey());

                if(currentList.get(0).length() > currentHighest) {
                    currentHighest = currentList.get(0).length();
                    mostAnagrams.clear();
                    mostAnagrams.add(currentList.get(0));
                    System.out.println("new highest anagram : " + pair.getValue());
                }

                if(currentList.get(0).length() == currentHighest && currentList.get(0).length() > mostAnagrams.get(0).length()) {
                    currentHighest = currentList.get(0).length();
                    mostAnagrams.clear();
                    mostAnagrams.add(currentList.get(0));
                }

                if(currentList.get(0).length() == currentHighest && currentList.get(0).length() == mostAnagrams.get(0).length()){
                    mostAnagrams.add(currentList.get(0));
                }
                it.remove(); // avoids a ConcurrentModificationException

            }
            return mostAnagrams;
    }

}
