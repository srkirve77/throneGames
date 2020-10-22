package com.geektrust.tameofthrones.service;

import com.geektrust.tameofthrones.dto.Kingdom;
import com.geektrust.tameofthrones.exchanges.GetMessage;

public interface receiveMessage{
    public boolean decipherMessage(GetMessage getMessage);
}