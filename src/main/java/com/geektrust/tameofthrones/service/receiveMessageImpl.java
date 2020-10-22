package com.geektrust.tameofthrones.service;

import com.geektrust.tameofthrones.dto.Kingdom;
import com.geektrust.tameofthrones.dto.Southeros;
import com.geektrust.tameofthrones.exchanges.GetMessage;
import com.geektrust.tameofthrones.service.receiveMessage;
import com.geektrust.tameofthrones.service.stringOperations;
import java.util.Map;

public class receiveMessageImpl implements receiveMessage {
    
    stringOperations stringoperations = new stringOperationsImpl();

    public boolean decipherMessage(GetMessage getMessage) {
        String kingdomName = getMessage.getKingdomName();
        String message     = getMessage.getMessage();
        Map<String,Kingdom> kingdoms = Southeros.getInstance().kingdoms;
        Kingdom ally       = kingdoms.get(kingdomName);
        String allyEmblem  = ally.getEmblem();
        String rotatedString = stringoperations.rotateString(message, allyEmblem.length());
        boolean ans = stringoperations.verifyStringPresence(rotatedString,allyEmblem);
        return ans;
    }

}







