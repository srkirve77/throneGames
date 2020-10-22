package com.geektrust.tameofthrones.service;

import com.geektrust.tameofthrones.service.StringOperations;
import java.util.Arrays;

public class StringOperationsImpl implements StringOperations{

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
        if(rotatedString.length()<allyEmblem.length() || allyEmblem.length()==0)
            return false;
        rotatedString = sortString(rotatedString); 
        allyEmblem = sortString(allyEmblem);
        int j = 0;
        for(int i = 0 ; i < rotatedString.length() ; i++ ) {
            if( Character.compare(rotatedString.charAt(i),allyEmblem.charAt(j))==0) {
                    j++;
        
                if(j==allyEmblem.length())
                    return true;
            }
        }

        return false;
    }
}