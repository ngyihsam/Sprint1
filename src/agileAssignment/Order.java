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
public class Order {
    
    private ArrayList<String> orderList;
    private String restaurantNm;
    
    
    
    public void setOrderList(ArrayList<String> od){
        orderList=od;
    }
    
    public ArrayList<String> getOrderList(){
        return orderList;
    }    
    
    
    public void setResNm(String rs){
        restaurantNm=rs;
    }
    
    public String getResNm(){
        return restaurantNm;
    }    
    
    
    public static void main(String []args){
        int no;
        Scanner sc=new Scanner(System.in);
        Order od=new Order();
        Restaurant r=new Restaurant();
        no=r.ChooseRes();
        System.out.println();
        r.ChooseMenu((no-1));
        r.displayOrderList();
        
        
    
    }
}
