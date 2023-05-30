package cattopia;


import java.util.*;

public class User {
    private String UserID;
    private String Name;
    private String Location;
    private String ContactInfo;
    private ArrayList<String> OwenedCats;
    private ArrayList<String> DonateTo; 

    public User(String UserID, String Name, String Location, String ContactInfo, ArrayList<String> OwenedCats, ArrayList<String> DonateTo) {
        this.UserID = UserID;
        this.Name = Name;
        this.Location = Location;
        this.ContactInfo = ContactInfo;
        this.OwenedCats = OwenedCats;
        this.DonateTo = DonateTo;
    }

    public User(String UserID, String Name, String Location, String ContactInfo) {
        this.UserID = UserID;
        this.Name = Name;
        this.Location = Location;
        this.ContactInfo = ContactInfo;
    }
    
    public User() {
    }
    
    

    public String getUserID() {
        return UserID;
    }

    public String getName() {
        return Name;
    }

    public String getLocation() {
        return Location;
    }

    public String getContactInfo() {
        return ContactInfo;
    }

    public ArrayList<String> getOwenedCats() {
        return OwenedCats;
    }

    public ArrayList<String> getDonateTo() {
        return DonateTo;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public void setContactInfo(String ContactInfo) {
        this.ContactInfo = ContactInfo;
    }

    public void setOwenedCats(ArrayList<String> OwenedCats) {
        this.OwenedCats = OwenedCats;
    }

    public void setDonateTo(ArrayList<String> DonateTo) {
        this.DonateTo = DonateTo;
    }
    
    
    
    
    // a method to request adopting a cat from their owner while checking if the requirement are met
    public static void adoptionReq(Cat cat, Individual user, User owner) {
        Scanner input = new Scanner (System.in);
        // check if the conditions are met
        if (!((user.getOwenedCats()).isEmpty()) == cat.isLikesCats() && user.isHasChildren() == cat.isLikesChildrens()) {

            if( owner instanceof Individual) {  //if the the user is adopting from an individual

                System.out.println("These are the owner contatct info, please contact them to arrage adoption.\n" + ((Individual)owner).getContactInfo() );
                cat.setAdoptionState("Pending"); // set cat's adoption state

            } else { //if the the user is adopting from a shelter

                System.out.println("please enter a time for the meeting and make sure it is written like this yyyy/mm/dd 00:00PM/AM: ");
                
      
                // scanner for user input
                String timeChoice = input.next();
                if (((Shelter)owner).searchAppointment(timeChoice) == null ){
                    Appointment app = new Appointment( timeChoice, user.getUserID(), owner.getUserID(), "Pending");
                
                       ((Shelter)owner).getReservedAppointment().add(app);
                       
                System.out.println("You have succesfully made an apponitment with this shelter!");
                cat.setAdoptionState("Pending"); // set cat's adoption state
                }
                else{
                    
                      System.out.println("sorry! this timing is already reserved. please pick another one.");
                 
 
                
                }
                
              

            }

        } else {
            System.out.println("Sorry! you cannot adopt this cat due to unmet conditions.");
        }

    }
// a method for approving adoption reqest 
    public static void adoptionApprove(Cat cat) {
        cat.setAdoptionState("Adopted");  // set cat's adoption state
    }
// a method for canceling adoption reqest
    public static void adoptionCancel(Cat cat) {
        cat.setAdoptionState("Available");  // set cat's adoption state
    }
    
    
  
    //Offer Cat Method !!
    public void OfferCat(){
        Scanner input = new Scanner(System.in);
// Prompt the user to enter cat info :
        System.out.println("Enter cat information :(Note : You should enter it with this order : catId, catName, sex, age, breed, bound (Enter the name please), behavior, disabled, medicalHistory, likesCats, likesChildrens, adoptionState, adoptionReason, adoptionFees");
       // Fill in cat info :
         int catId = input.nextInt();
         String catName = input.next();
         String sex = input.next();
         int age = input.nextInt();
         String breed = input.next();
         String CatBoundName = input.next(); // Taking just that name to search for the cat object later.
         String behavior = input.next();
         boolean disabled = input.nextBoolean();
         String medicalHistory = input.next();
         boolean likesCats = input.nextBoolean();
         boolean likesChildrens = input.nextBoolean();
         String adoptionState = input.next();
         String adoptionReason = input.next();
         int adoptionFees = input.nextInt();
         
           // Create Cat object :
       Cat newCat = new Cat(catId,catName, sex, age,breed,null,behavior,disabled,medicalHistory,likesCats,likesChildrens,adoptionState, adoptionReason, adoptionFees);
        // Setting the cat’s bound after searching for it : 
        newCat.setBound(newCat.Searchbound(CatBoundName));
      // Add it to the cats database ( Arraylist ) :
        newCat.addNewCattoDatabase(newCat) ;
     // Printing a message to the user :
        System.out.println("Your Cat is added to the DataBase");
     
        
    } //Offer cat end here !! 

    //Donation method start here
    
    public static void donate(){
        System.out.println("What type of donation will you make?/nFood donation/nMoney donation/nToys donation");
        System.out.println("When will you donate?(please enter the date in this form dd/mm/yyyy)");
        Scanner input = new Scanner(System.in);
        //Fill donation information
        String DonationType = input.next();
        String DonationDate = input.next();
        if(DonationType.equalsIgnoreCase("Food donation")){
            System.out.println("Enter the food information in this order: Brand name, Exp date as (dd/mm/yyyy), Manufec date as (dd/mm/yyyy), size.");
        //Fill food infrmation    
            String BrandName = input.next();
            String ExpDate = input.next();
            String ManufecDate = input.next();
            String size = input.next();
            System.out.println("The brand of the food:"+BrandName+"/nThe food Exp date:"+ExpDate+"/nThe food Manufec date:"+ManufecDate+"/nThe food size:"+size);
        }
        if(DonationType.equalsIgnoreCase("Money donation")){
            System.out.println("How much money do you want to donate?");
            int amount = input.nextInt();
            if(amount <=0){
                System.out.println("You have entered the wrong amount.");
            }
            if(amount>0){
                System.out.println("Thanks for your donation.");
            }
        }
        if(DonationType.equalsIgnoreCase("Toys donation")){
            System.out.println("What size and condition of toys will you donate?");
        //Fill toy infrmation    
            String condition = input.next();
            String size = input.next();
            System.out.println("The size of the toy: "+size+"/nThe condition of the toy: "+condition);
        }
            
    }
    
    //Donation method end here
    
     public static void FilterCats(){
        System.out.println("filter cats by: "
                + "1-Breed  2-Age  3-Gender  4-behavior"
                + "5-Disabled  6-Likes children  7-Likes cats");
        Scanner input = new Scanner(System.in);
        int Uchoice=input.nextInt();
        
        switch(Uchoice){
            case 1:
                System.out.println("what breed do you want to display ? ");
                String breed=input.next();
                Cat.FilterByBreed(breed);
                break;
            case 2:
                System.out.println("what age do you want to display ? ");
                int age=input.nextInt();
                Cat.FilterByAge(age);
                break;
            case 3:
                System.out.println("what gender do you want to display ? ");
                String gender=input.next();
                Cat.FilterByGender(gender);
                break;
            case 4:
                System.out.println("what behavior do you to display ? ");
                String behavior=input.next();
                Cat.FilterByBehavior(behavior);
                break;
            case 5: 
                Cat.FilterDisabled();
                break;
            case 6:
                Cat.FilterLikesChildren();
                break;
            case 7:
                Cat.FilterLikesCats();
                break;
            default :
                System.out.println("invalid choice ");
                break;  
        }
    }
     
}
