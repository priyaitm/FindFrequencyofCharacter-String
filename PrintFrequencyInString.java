package review283;

import java.util.HashMap;
import java.util.Map;

public class PrintFrequencyInString {

       void getCharCount( String name){
        Map<Character,Integer> charMap = new HashMap<Character,Integer>();  // create HashMap

        char strArray[] = name.toCharArray();               // convert name string into character array

        for(char c : strArray){                           // take loop
            if(!String.valueOf(c).isBlank()) {

                if (charMap.containsKey(c)) {          //in charMap there is method , using contain method ,the first key represent char
                    charMap.put(c, charMap.get(c) + 1); //if the character 'c' present in hashmap ,going to increase count by 1
                } else {
                    charMap.put(c, 1);                // if the character 'c' is not present
                }
            }
        }

        System.out.println(name + " : " +charMap);
    }

    public static void main(String[] args) {
        PrintFrequencyInString printFrequencyInStringObj = new PrintFrequencyInString();


        printFrequencyInStringObj.getCharCount("We have a good future ahead");
    }

}
