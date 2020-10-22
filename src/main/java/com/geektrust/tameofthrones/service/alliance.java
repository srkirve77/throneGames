package com.geektrust.tameofthrones.service;

import com.geektrust.tameofthrones.dto.Kingdom;
import com.geektrust.tameofthrones.dto.Southeros;
import com.geektrust.tameofthrones.exchanges.GetMessage;
import com.geektrust.tameofthrones.io.ReadFile;
import com.geektrust.tameofthrones.service.receiveMessage;
import com.geektrust.tameofthrones.service.receiveMessageImpl;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class alliance {

    
	public static void updateAlliance(Kingdom ruler,GetMessage getMessage) { 
        receiveMessage receivemessage = new receiveMessageImpl();
        if( receivemessage.decipherMessage(getMessage)) {
            String KingdomName = getMessage.getKingdomName();
            ruler.getAllies().add(KingdomName);
        }
    }

}