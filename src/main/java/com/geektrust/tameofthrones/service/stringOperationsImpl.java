package com.geektrust.tameofthrones.service;

import com.geektrust.tameofthrones.service.stringOperations;
import java.util.Arrays;

public class stringOperationsImpl implements stringOperations{

    public String sortString(String inputString) {
        char tempArray[] = inputString.toCharArray();           
        // sort tempArray 
        Arrays.sort(tempArray);           
        // return new sorted string 
        return new String(tempArray); 
    }

    public String rotateString(String message, int noOftimes) {
        String rotatedString = new String();
        for(int i = 0 ; i < message.length() ; i++ ) {                
            int charValue = message.charAt(i)-'A';
            charValue -= noOftimes;
            while(charValue<0)
                charValue += 26;
            rotatedString += (char)('A' + charValue);
        }
        return rotatedString;
    }

    public boolean verifyStringPresence(String rotatedString, String allyEmblem) {
        if(rotatedString.length()<allyEmblem.length())
            return false;
        sortString(rotatedString); 
        sortString(allyEmblem);
        for(int i = 0 ; i < rotatedString.length() ; i++ ) {
            if( Character.compare(rotatedString.charAt(i),allyEmblem.charAt(0))==0) {
                int j = 0;
                while(Character.compare(rotatedString.charAt(i),allyEmblem.charAt(j))==0) {
                    i++;
                    j++;
                    if(j==allyEmblem.length())
                        return true;
                    if(i==rotatedString.length())
                        return false;
                }
                i = i - j;
            }
        } 
        return false;
    }
}