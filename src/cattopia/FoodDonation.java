package cattopia;

import java.util.*;

public class FoodDonation extends Donation{
    private String BrandName;
    private Date ExpDate;
    private Date ManufecDate;
    private String Size;

    public FoodDonation(Donation DonationType, Date DonationDate, String UserID, String ShelterID) {
        super(DonationType, DonationDate, UserID, ShelterID);
    }

    public FoodDonation(String BrandName, Date ExpDate, Date ManufecDate, String Size, Donation DonationType, Date DonationDate, String UserID, String ShelterID) {
        super(DonationType, DonationDate, UserID, ShelterID);
        this.BrandName = BrandName;
        this.ExpDate = ExpDate;
        this.ManufecDate = ManufecDate;
        this.Size = Size;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public Date getExpDate() {
        return ExpDate;
    }

    public void setExpDate(Date ExpDate) {
        this.ExpDate = ExpDate;
    }

    public Date getManufecDate() {
        return ManufecDate;
    }

    public void setManufecDate(Date ManufecDate) {
        this.ManufecDate = ManufecDate;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }
    
}
