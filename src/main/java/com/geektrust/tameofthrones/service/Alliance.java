package com.geektrust.tameofthrones.service;

import com.geektrust.tameofthrones.dto.Kingdom;
import com.geektrust.tameofthrones.dto.Southeros;
import com.geektrust.tameofthrones.exchanges.GetMessage;
import com.geektrust.tameofthrones.io.ReadFile;
import com.geektrust.tameofthrones.service.ReceiveMessage;
import com.geektrust.tameofthrones.service.ReceiveMessageImpl;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Alliance {

    
	public static void updateAlliance(Kingdom ruler,GetMessage getMessage) { 
        ReceiveMessage receiveMessage = new ReceiveMessageImpl();
        if( receiveMessage.decipherMessage(getMessage)) {
            String KingdomName = getMessage.getKingdomName();
            ruler.addAlly(KingdomName);
        }
    }

}