package com.geektrust.tameofthrones.service;

import com.geektrust.tameofthrones.dto.Kingdom;
import com.geektrust.tameofthrones.dto.Southeros;
import com.geektrust.tameofthrones.exchanges.GetMessage;
import com.geektrust.tameofthrones.service.ReceiveMessage;
import com.geektrust.tameofthrones.service.StringOperations;
import java.util.Map;

public class ReceiveMessageImpl implements ReceiveMessage {
    
    StringOperations stringOperations = new StringOperationsImpl();

    public boolean decipherMessage(GetMessage getMessage) {
        String kingdomName = getMessage.getKingdomName();
        Map<String,Kingdom> kingdoms = Southeros.getInstance().kingdoms;
        if(!kingdoms.containsKey(kingdomName))
            return false;
        String message     = getMessage.getMessage();
        Kingdom ally       = kingdoms.get(kingdomName);
        String allyEmblem  = ally.getEmblem();
        String rotatedString = stringOperations.rotateString(message, allyEmblem.length());
        boolean ans = stringOperations.verifyStringPresence(rotatedString,allyEmblem);
        return ans;
    }

}







