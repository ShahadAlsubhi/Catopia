/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cattopia;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author shaha
 */
public class CatTopia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        File inputData = new File("Database.txt"); // Reads the input data
        ArrayList<User> accounts = new  ArrayList<User>();
        ArrayList<Cat> cats = new  ArrayList<Cat>();
        
     

        if (!inputData.exists()) {    //check if the file exists
            System.out.print("the file " + inputData.getName() + " is not found\n Check in " + inputData.getAbsolutePath());
            System.exit(0);
        }
        
        Scanner input = new Scanner(inputData); //Scanner to read input
        String command = null;
   
        System.out.println("Loading database. . .");
        
          do { // Reading the commands
            command = input.next();
              if (command.equalsIgnoreCase("Add_Account_Indi")) {
                  
                  
                  
              
              }else if (command.equalsIgnoreCase("Add_Cat")) {
        
              
            }
                else if (command.equalsIgnoreCase("Add_Account_Shelter")) {
        
              
            }

 

        } while (!command.equalsIgnoreCase("Quit"));
        
           System.out.println("--------------- Welcome to Catopia System ---------------");
           
           
    }
    
}
