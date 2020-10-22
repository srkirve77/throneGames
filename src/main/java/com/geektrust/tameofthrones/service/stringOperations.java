package com.geektrust.tameofthrones.service;


public interface stringOperations{    
    public  String sortString(String inputString);
    public  String rotateString(String message, int noOftimes);
    public  boolean verifyStringPresence(String rotatedString, String allyEmblem);
}