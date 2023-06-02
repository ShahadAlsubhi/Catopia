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
        
        addCats(cats); //add cats to the array
        
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
                  Cat cat = new Cat();
                  cat.setCatId(input.nextInt());
                  cat.setCatName(input.next());
                  cat.setSex(input.next());
                  cat.setAge(input.nextInt());
                  cat.setBreed(input.next());
//                  cat.setBound(input.next());???????????????????
                  cat.setBehavior(input.next());
                  cat.setDisabled(input.nextBoolean());
                  cat.setMedicalHistory(input.next());
                  cat.setLikesCats(input.nextBoolean());
                  cat.setLikesChildrens(input.nextBoolean());
                  cat.setAdoptionState(input.next());
                  cat.setAdoptionReason(input.next());
//                  cat.setAdoptionUpdates();?????????????????????
                  cat.setAdoptionFees(input.nextInt());
                  cat.addNewCattoDatabase(cat);
              
            }
                else if (command.equalsIgnoreCase("Add_Account_Shelter")) {
                  Shelter account = new Shelter();
                  account.setShelterName(input.next());
                  account.setVerification(input.nextBoolean());
//                  account.setRecievedDonation(?????);
//                  account.setReservedAppointment(??????);
                  accounts.add(account);
        
              
            }

 

        } while (!command.equalsIgnoreCase("Quit"));
              command = null;
           System.out.println("--------------- Welcome to Catopia System ---------------");
           System.out.println("1. Adopt a Cat");
            System.out.println("2.Offer a cat for adoption");
            System.out.println("3. Filter avaible Cats");
            System.out.println("4. Donate to a Shelter");
            System.out.println("5. Quit");
           System.out.println("Please Enter your Choice: ");
           
           do { // Reading the commands
            command = inputUser.next();
              if (command.equalsIgnoreCase("1")) {
                  System.out.println("the available cats : ");
                  
                  for(int i=0;i<cats.size();i++){
                      System.out.println(cats.get(i));
                      System.out.println("---------------------------------------------------------------------");
                  }
                  
                  System.out.println("enter the cat ID you would like to adopt : ");
                  int CatID=input.nextInt();
                Individual user =new Individual();
                  accounts.get(0).adoptionReq(cats.get(CatID-1),user,searchUser(cats.get(CatID-1).getOwnerId(),accounts));
                  cats.get(CatID).setAdoptionState("unavailable");
              
              }else if (command.equalsIgnoreCase("2")) {
                  accounts.get(0).OfferCat(cats);
        
              
            }
                else if (command.equalsIgnoreCase("3")) {
                    accounts.get(0).FilterCats();
        
              
            }
                else if (command.equalsIgnoreCase("4")) {
                    accounts.get(0).donate();
        
              
            }  

 

        } while (!command.equalsIgnoreCase("5"));
           
           
    }
    
    public static void addCats(ArrayList<Cat> cats){
        
        cats.add(new Cat(1,"1","toomy","male",2,"abyssinian",null,"friendly",false,"medical",false,true,"for adoptuin","so many cats",null,20));
        cats.add(new Cat(2,"2","lucy","female",4,"bengal",null,"relaxed",false,"medical",true,false,"for adoptuin","to save money",null,25));
        cats.add(new Cat(3,"3","luna","female",3,"bengal",null,"playful",true,"medical",true,true,"for adoptuin","so many cats",null,30));
        cats.add(new Cat(4,"4","charlie","male",1,"birman",null,"relaxed",true,"medical",true,true,"for adoptuin","so young",null,20));
        cats.add(new Cat(5,"5","bella","female",4,"bombay",null,"playful",false,"medical",false,false,"for adoptuin","too old",null,25));
        
    }
    
    public static User searchUser(String id,  ArrayList<User> accounts){
              
  for (int i = 0; i < accounts.size(); i++){
      if (accounts.get(i).getUserID().equalsIgnoreCase(id))
          return accounts.get(i);
  }
  return null;
     }
    
}
