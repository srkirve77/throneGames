package com.geektrust.tameofthrones.dto;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
/**
 * Kingdom class which will contain name of kingdom and information about its emblem
 */

public class Kingdom {
	private String name;
	final private String emblem;
	private List<String> allies;

	public Kingdom(String name , String emblem) {
		this.name = name;
		this.emblem = emblem;
		this.allies = new ArrayList<String>();
	}

	public String getKingdomName() {
		return this.name;
	}

	public String getEmblem() {
		return this.emblem;
	}

	public List<String> getAllies() {
		return this.allies;
	}	

	public void addAlly(String kingdomName) {
		this.allies.add(kingdomName);
	}
}