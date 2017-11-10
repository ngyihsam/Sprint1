package AffiliateRegistration;

public class Affiliate {
    String ownerName;
    String restaurantName;
    String contactNo;
    String ICNumber;
    String email;
    
    public Affiliate(){ }
    
    public Affiliate(String ownerName, String restaurantName, String contactNo, String ICNumber, String email){
        this.ownerName = ownerName;
        this.restaurantName = restaurantName;
        this.contactNo = contactNo;
        this.ICNumber = ICNumber;
        this.email = email;
    }
    
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    
    public void setRestaurantName(String restaurantName){
        this.restaurantName = restaurantName;
    }
    
    public void setContactNo(String contactNo){
        this.contactNo = contactNo;
    }
    
    public void setICNumber(String ICNumber){
        this.ICNumber = ICNumber;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getOwnerName(){
        return ownerName;
    }
    
    public String getRestaurantName(){
        return restaurantName;
    }
    
    public String getContactNo(){
        return contactNo;
    }
    
    public String getICNumber(){
        return ICNumber;
    }
    
    public String getEmail(){
        return email;
    }

    @Override
    public String toString(){
        return (ownerName +", "+restaurantName+ ", " +contactNo+", " +ICNumber+", " +email+ "\n");
    }
}
