/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileAssignment;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author user1
 */
public class Restaurant {
    private String[] name={"Rapapa Restaurant","Mcd","KFC","Sushi Mentai","FunOK Restaurant"};
    private String[][] menu={{"Mushroom Chicken Pasta","Chicken Chop","Nasi Lemak","Black Pepper Chicken Rice"},
                             {"Filet-O-Fish","McChicken","Double CheeseBurger","GCB","Big Mac","Spicy Chicken McDeluxe"},
                             {"Chicken Zinger","Veg Zinger","Rice Meal Box","Hot & Crispy Chicken","Cheesy Wedges"},
                             {"Salmon","Kani Maki","Tamago Maki","Unagi","Inari Ebiko","Cheese Chu Maki","Tempura Udon"},
                             {"Chao Gui Diao","Wan Dan Hor","Yee Mee Soup with Egg","Fried Rice"}};
    private String[][] price={{"RM 5.00","RM 5.50","RM 3.50","RM 5.80",},
                              {"RM 8.99","RM 8.99","RM 9.50","RM 12.50","RM 10.99","RM 11.50",},
                              {"RM 5.30","RM 7.00","RM 8.80","RM 6.60","RM 5.00"},
                              {"RM 2.80","RM 2.80","RM 1.80","RM 3.80","RM 1.80","RM 2.80","RM 9.90"}, 
                              {"RM 6.50","RM 4.80","RM 4.60","RM 5.00"} };
            Scanner sc=new Scanner(System.in);
            int no;
            Order od=new Order();
    
     public Restaurant(){
        name=name;
        menu=menu;  
        
    }
    
    public Restaurant(String[] nm,String[][] mn){
        name=nm;
        menu=mn;
    }
    
    public int ChooseRes(){
        String res="\n";
       
        do{
        for(int i=0;i<name.length;i++){
        res+=(i+1)+". "+name[i]+"\n";
        }
        res+="Please select a Restaurant >";
        System.out.print(res);
        no=sc.nextInt();

        } while(no<1||no>name.length);
        return no;
    }
    
    
    
      public void ChooseMenu(int res){
        
        ArrayList<String> list=new ArrayList<String>();
        int choice=1;
        int num=0;
        
        do{
            do{
            String m="\nMenu\t(Price)\n========================\n";
        for(int i=0;i<menu[res].length;i++){
        m+=(i+1)+". "+menu[res][i]+"\t( "+price[res][i]+")\n";
        
        System.out.println(m);
        System.out.print("Order >");
        }
         no=sc.nextInt();
         
         if(no>=1&&no<menu[res].length){
         String fd=menu[res][(no-1)];
             list.add(fd);
           
           
           System.out.print("Continue order? (Exit=0)>");
           choice=sc.nextInt();
           
         }

         
        }while(no<1||no>menu[res].length); 
        
      } while(choice!=0);
    
        od.setOrderList(list);
    
      }  
      
      
        public void displayOrderList(){
 
            String ol="\nOrderList\n===========\n";
        for(int i=0;i<od.getOrderList().size();i++){
            ol+=(i+1)+". "+od.getOrderList().get(i)+"\n";

        
        }
                    System.out.println(ol);
    }  
    
      
      
    public void setName(String[] nm){
        name=nm;
    }
    
    
}




