/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cattopia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author lojai
 */
public class Main {
    
public static void main(String[] args) throws FileNotFoundException {
    // Storing data from inputDB file
    File inputDB = new File("inputDB.txt");
    if (!inputDB.exists()) {
        System.out.println("File " + inputDB.getName() + " doesn't exist");
        System.exit(0);
    }
    Scanner readerDB = new Scanner(inputDB);
    String command;
    do {
        command = readerDB.next();
        if(command.equalsIgnoreCase("adoopt a cat")) {
            
        }
        if(command.equalsIgnoreCase("Offer a cat ")) {
            
        }
        if(command.equalsIgnoreCase("Fillter cats")) {
            
        }
        if(command.equalsIgnoreCase("Donate")) {
            
        }        
        
            
        
    } while (!command.equals("Quit"));
    readerDB.close();

    
}}
