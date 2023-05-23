package cattopia;


import java.util.*;

public class Donation {
    private Donation DonationType;
    private Date DonationDate;
    private String UserID;
    private String ShelterID;  

    public Donation(Donation DonationType, Date DonationDate, String UserID, String ShelterID) {
        this.DonationType = DonationType;
        this.DonationDate = DonationDate;
        this.UserID = UserID;
        this.ShelterID = ShelterID;
    }

    public Donation getDonationType() {
        return DonationType;
    }

    public void setDonationType(Donation DonationType) {
        this.DonationType = DonationType;
    }

    public Date getDonationDate() {
        return DonationDate;
    }

    public void setDonationDate(Date DonationDate) {
        this.DonationDate = DonationDate;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getShelterID() {
        return ShelterID;
    }

    public void setShelterID(String ShelterID) {
        this.ShelterID = ShelterID;
    }
    
    
}
