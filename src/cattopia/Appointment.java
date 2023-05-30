
package cattopia;

import java.util.*;


public class Appointment {
   private Date Date;
   private String NewOwnerID;
   private String OldOwnerID;
   private String catID;
   private String State;

    public Appointment(Date Date, String NewOwnerID, String OldOwnerID, String State) {
        this.Date = Date;
        this.NewOwnerID = NewOwnerID;
        this.OldOwnerID = OldOwnerID;
        this.State = State;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public String getNewOwnerID() {
        return NewOwnerID;
    }

    public void setNewOwnerID(String NewOwnerID) {
        this.NewOwnerID = NewOwnerID;
    }

    public String getOldOwnerID() {
        return OldOwnerID;
    }

    public void setOldOwnerID(String OldOwnerID) {
        this.OldOwnerID = OldOwnerID;
    }

    public String getCatID() {
        return catID;
    }

    public void setCatID(String catID) {
        this.catID = catID;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }
   
   
}
