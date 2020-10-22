package com.geektrust.tameofthrones.exchanges;


/**
 * This class objects are used to store the input pairs of kingdom name and message
 * and then these list of objects are processed simultaneously
 */
public class GetMessage{

    private String kingdom_name;
    private String message;

    public GetMessage(String kingdom_name , String message) {
        this.kingdom_name = kingdom_name;
        this.message = message;
    }

    public String getKingdomName() {
        return this.kingdom_name;
    }

    public String getMessage() {
        return this.message;
    }

}