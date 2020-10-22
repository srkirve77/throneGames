package com.geektrust.tameofthrones.io;

import com.geektrust.tameofthrones.exchanges.GetMessage;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
import java.util.List;

/**
 * This class member function reads the input file stores the data into its data member
 */
public class ReadFile {

    private List<GetMessage> getMessages;
    
    public ReadFile() {
        getMessages = new ArrayList<GetMessage>();
    }

    public void setMessages( List<GetMessage> getMessages ) {
        this.getMessages = getMessages;
    }

    public List<GetMessage> getMessages() {
        return this.getMessages;
    }

    /**
     * This method reads the input file
     * @param arg this argument contains the location of input file
     */
    
    public void readInputFile(String arg) {
        try {
            File myObj = new File(arg);
            Scanner myReader = new Scanner(myObj);
            
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] words = data.split("\\s");
                /**
                 * If there is no message or name of kingdom is not there then exception is thrown
                 */
                if(words.length ==0 || words.length ==1) { 
                    System.out.println("Invalid Input data !!!");
                }
                String message = data.substring( words[0].length()+1, data.length()  );
                /**
                 * here we store the data in data member of this class 
                 */
                this.getMessages().add(new GetMessage(words[0], message) );
            }
            myReader.close();        
        }
        /**
         * Exception is caught if input file is not found at mentioned location
        */ 
        catch (FileNotFoundException f) { 
              System.out.println("Error : Input File Not Found!\n");
              f.printStackTrace();
        } 
      
    }

}