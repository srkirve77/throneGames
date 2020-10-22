/** 
@author Shubham Rajendra Kirve
@version 1.0
@since 2020-09-26

*/
package com.geektrust.tameofthrones;

import com.geektrust.tameofthrones.dto.Kingdom;
import com.geektrust.tameofthrones.dto.Southeros;
import com.geektrust.tameofthrones.exchanges.GetMessage;
import com.geektrust.tameofthrones.io.ReadFile;
import com.geektrust.tameofthrones.service.alliance;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
		Southeros southeros = Southeros.getInstance();		//Get the instance of Southeros 
		
		southeros.ConstructSoutheros();	/*Construct the southeros with the known information about southeros*/
		 
		ReadFile readFile = new ReadFile(); /*Read the input file */
		readFile.readInputFile(args[0]);
		LinkedHashSet <String> allies = new LinkedHashSet<String>(); 
		List<GetMessage> getMessages = readFile.getMessages();
		Kingdom space = southeros.kingdoms.get("SPACE");
		for(int i = 0 ; i < getMessages.size() ; i++ )
		{
			alliance.updateAlliance(space,getMessages.get(i));
		}
		
		/*if shan have allies more than half of the total no of kingdoms 
						then He will win the southeros and we will print his ally kingdoms.	*/
		if(space.getAllies().size()>2 ) 
		{			
			System.out.println("SPACE ");
			for(String ally : allies) {
				System.out.print(ally + " ");
			}	
			System.out.println();
		}
		else{
			System.out.println("NONE");
		}
	}
}