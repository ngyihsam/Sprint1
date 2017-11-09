package AffiliateRegistration;
import java.util.*;

public class AffiliateRegistration{

    /*Object[][] affiliateArray = {{"Ng Yih Sam", "Alibaba Food", "0165502038", "970110565289", "yihsam1997@gmail.com"},
                                 {"Quek Wei Jian", "Spritzer", "0123456789", "970214146603", "quek@hotmail.com"},                    //no use
                                 {"Phuah Wai Yan", "KenKen", "0115659879", "970125105645", "pwy@gmail.com"},
                                 {"Seong Jian Sheng", "VegeTokok", "0122256999", "971102551203", "sjs111@hotmail.com"}};*/
    
    /*List<Affiliate> affiliateArray = Arrays.asList(new Affiliate("Ng Yih Sam", "Alibaba Food", "0165502038", "970110565289", "yihsam1997@gmail.com"),
                                                  new Affiliate("Quek Wei Jian", "Spritzer", "0123456789", "970214146603", "quek@hotmail.com"),                     //no use
                                                  new Affiliate("Phuah Wai Yan", "KenKen", "0115659879", "970125105645", "pwy@gmail.com"),
                                                  new Affiliate("Seong Jian Sheng", "VegeTokok", "0122256999", "971102551203", "sjs111@hotmail.com"));*/
    
    List<Affiliate> affiliateArray = new LinkedList<Affiliate>();

    public AffiliateRegistration(){
        Affiliate a1 = new Affiliate("Ng Yih Sam", "Alibaba Food", "0165502038", "970110565289", "yihsam1997@gmail.com");
        Affiliate a2 = new Affiliate("Quek Wei Jian", "Spritzer", "0123456789", "970214146603", "quek@hotmail.com");
        Affiliate a3 = new Affiliate("Phuah Wai Yan", "KenKen", "0115659879", "970125105645", "pwy@gmail.com");
        Affiliate a4 = new Affiliate("Seong Jian Sheng", "VegeTokok", "0122256999", "971102551203", "sjs111@hotmail.com");
        affiliateArray.add(a1);
        affiliateArray.add(a2);
        affiliateArray.add(a3);
        affiliateArray.add(a4);
        
        System.out.println("Please select the following: ");
        System.out.println("1. Register as affiliate\n");
        System.out.print("Your choice: ");
        
    }
    
    public void registerAsAffiliate(){                           //register owner as an affiliate
        Scanner scanner2 = new Scanner(System.in); 
        System.out.print("Please enter owner name: ");
        String ownerName = scanner2.nextLine();
        while(!ownerName.matches("[A-Za-z ]+") || ownerName.equals(" ")){
            System.out.print("Alphabets only!\nPlease enter owner name: ");
            ownerName = scanner2.nextLine();
        }
        scanner2.reset();
        System.out.print("Please enter your restaurant name: ");
        String restaurantName = scanner2.nextLine();
        while(restaurantName.equals(" ")){
            System.out.print("Please enter a correct restaurant name!\nPlease enter your restaurant name: ");
            restaurantName = scanner2.nextLine();
        }
        scanner2.reset();
        System.out.print("Please enter contact number: ");
        String contactNo = scanner2.nextLine();
        while(!contactNo.matches("\\d{10,11}") || contactNo.equals(" ")){
            System.out.print("10 or 11 digits only!\nPlease enter contact number: ");
            contactNo = scanner2.nextLine();
        }
        scanner2.reset();
        System.out.print("Please enter your IC number: ");
        String ICNumber = scanner2.nextLine();
        while(!ICNumber.matches("\\d{12}") || ICNumber.equals(" ")){
            System.out.print("12 Digits only!\nPlease enter your IC number: ");
            ICNumber = scanner2.nextLine();
        }
        scanner2.reset();
        System.out.print("Please enter your email address: ");
        String email = scanner2.nextLine();
        while(!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}") || email.equals(" ")){
            System.out.print("Invalid format!\nPlease enter your email address: ");
            email = scanner2.nextLine();
        }
        affiliateArray.add(new Affiliate(ownerName, restaurantName, contactNo, ICNumber, email));
        System.out.println("\nYou are successfully registered as an affiliate of Fastest Delivery!\n\n");
    }
    
    public void displayAllAffiliate(){
            System.out.println("TO PROVE THAT THE OWNER IS ADDED AS AFFILIATE\n=============================================");
            for(Affiliate a:affiliateArray)  
                System.out.println(a.ownerName+", "+a.restaurantName+", "+a.contactNo+", "+a.ICNumber+", "+a.email);
    }
    
    
    public static void main(String[] args) {
        AffiliateRegistration run = new AffiliateRegistration();
        //run.displayAllAffiliate();                                  //for testing
        Scanner scanner1 = new Scanner(System.in);
        scanner1.useDelimiter("");
        while(!scanner1.hasNext("1")){
            System.out.print("Your choice: ");
            scanner1.nextLine();
        }
        int choice = scanner1.nextInt();
        run.registerAsAffiliate();
        run.displayAllAffiliate();
        
    }
    
}
