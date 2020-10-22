package com.geektrust.tameofthrones.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.geektrust.tameofthrones.dto.Kingdom;

/**
 * Southeros class contain the list of existing kingdoms
 * this class is a singleton class as there is and will be only one southeros!
 */
public class Southeros {

	private static Southeros single_instance = null;
	public Map<String,Kingdom> kingdoms;

	private Southeros() {
		this.kingdoms = new HashMap<String,Kingdom>();
	}

	public static Southeros getInstance() {
		if(single_instance == null) {
			single_instance = new Southeros();
		}

		return single_instance;
	}

	/**
	 * This method fills known information about southeros in this singleton class's
	 *  object 
	 */

	public void ConstructSoutheros() {
		this.kingdoms.put("SPACE", new Kingdom("SPACE","GORILLA"));
		this.kingdoms.put("LAND", new Kingdom("LAND","PANDA"));
		this.kingdoms.put("ICE", new Kingdom("ICE","MAMMOTH"));
		this.kingdoms.put("FIRE", new Kingdom("FIRE","DRAGON"));
		this.kingdoms.put("WATER", new Kingdom("WATER","OCTOPUS"));
		this.kingdoms.put("AIR", new Kingdom("AIR","OWL"));
	}

}