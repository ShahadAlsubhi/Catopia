
import java.util.*;


public class User {
    private String UserID;
    private String Name;
    private String Location;
    private String ContactInfo;
    private ArrayList<String> OwenedCats;
    private ArrayList<String> DonateTo; 
    // a method to request adopting a cat from their owner while checking if the requirement are met
//    public static void adoptionReq(Cat cat, Individual user, User owner) {
//        // check if the conditions are met
//        if (user.getHasCats() == cat.getLikesCats && user.getHasChildren() == cat.getLikesChildren) {
//
//            if( owner instanceof Individual) {  //if the the user is adopting from an individual
//
//                System.out.println("These are the owner contatct info, please contact them to arrage adoption.\n" + owner.getcontactInfo);
//                cat.setAdoptionState("Pending"); // set cat's adoption state
//
//            } else { //if the the user is adopting from a shelter
//
//                System.out.println("please pick a time for meeting: ");
//                System.out.println(owner.getAvailableTimes);
//                // scanner for user input
//                String timeChoice = input.next();
//                owner.getAvailableTimes.appoint(timeChoice);
//                System.out.println("You have succesfully made an apponitment with the shelter!");
//                cat.setAdoptionState("Pending"); // set cat's adoption state
//
//            }
//
//        } else {
//            System.out.println("Sorry! you cannot adopt this cat due to unmet conditions");
//        }
//
//    }
//// a method for approving adoption reqest 
//    public static void adoptionApprove(Cat cat) {
//        cat.setAdoptionState("Adopted");  // set cat's adoption state
//    }
//// a method for canceling adoption reqest
//    public static void adoptionCancel(Cat cat) {
//        cat.setAdoptionState("Available");  // set cat's adoption state
//    }
    
    
    ////// 
    /* Offer Cat Method !!
    public void OfferCat(){
// Prompt the user to enter cat info :
        System.out.println("Enter cat information :(Note : You should enter it with this order : catId, catName, sex, age, breed, bound (Enter the name please), behavior, disabled, medicalHistory, likesCats, likesChildrens, adoptionState, adoptionReason, adoptionFees");
      // Fill in cat info :
      
         int catId = input.nextInt();
         String catName = input.next();
         String sex = input.next();
         int age = input.nextInt();
         String breed = input.next();
         String catName = input.next();
         Cat bound =  Searchbound(String catName);
         String behavior = input.next();
         boolean disabled = input.nextBoolean();
         String medicalHistory = input.next();
         boolean likesCats = input.nextBoolean();
         boolean likesChildrens = input.nextBoolean();
         String adoptionState = input.next();
         String adoptionReason = input.next();
         int adoptionFees = input.nextInt();
      
     // Create Cat object : 
      Cat newCat = new Cat(catId, catName, sex, age, breed, bound, behavior, disabled, medicalHistory, likesCats, likesChildrens, adoptionState, adoptionReason,adoptionFees);
      
      // Add it to the cats database ( Arraylist ) :
        cat.addNewCattoDatabase(cat) ;
     
        
    } Offer cat end here !! */
/*
    public static void donate(){
        System.out.println("What type of donation will you make?/nFood donation/nMoney donation/nToys donation");
        Scanner input = new Scanner(System.in);
        String DonationType = input.next();
        if(DonationType.equalsIgnoreCase("Food donation")){
            System.out.println("Enter the food information in this order: Brand name, Exp date, Manufec date, size.");
            String BrandName = input.next();
            Date ExpDate = 
            Date ManufecDate = 
            String Size = input.next();
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
            String condition = input.next();
            String size = input.next();
            System.out.println("The size of the toy: "+size+"/nThe condition of the toy: "+condition);
        }
            
    }
    */
}
