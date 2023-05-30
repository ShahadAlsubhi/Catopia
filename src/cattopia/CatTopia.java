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
        
        Scanner input = new Scanner(inputData); //Scanner to read input Database
          Scanner inputUser = new Scanner(System.in); //Scanner to read input
        
        String command = null;
   
        System.out.println("Loading database. . .");
        
          do { // Reading the commands
            command = input.next();
              if (command.equalsIgnoreCase("Add_Account_Indi")) {
                  Individual account = new Individual();
                  account.setUserID(input.next());
                  account.setName(input.next());
                  account.setLocation(input.next());
                  account.setContactInfo(input.next());
                  account.setHasCat(input.nextBoolean());              
                  account.setHasChildren(input.nextBoolean());
                  accounts.add(account);

              }else if (command.equalsIgnoreCase("Add_Cat")) {
        
              
            }
                else if (command.equalsIgnoreCase("Add_Account_Shelter")) {
        
              
            }

 

        } while (!command.equalsIgnoreCase("Quit"));
              command = null;
           System.out.println("--------------- Welcome to Catopia System ---------------");
           System.out.println("1. Adopt a Cat");
            System.out.println("2.Offer a cat for adoption");
            System.out.println("3. Filter avaible Cats");
            System.out.println("4. Donate to a Shelter");
            System.out.println("5. Donate to a Shelter");
           System.out.println("Please Enter your Choice: ");
           
           do { // Reading the commands
            command = inputUser.next();
              if (command.equalsIgnoreCase("1")) {
                 

              
              }else if (command.equalsIgnoreCase("2")) {
        
              
            }
                else if (command.equalsIgnoreCase("3")) {
        
              
            }

 

        } while (!command.equalsIgnoreCase("5"));
           
           
    }
    
}
