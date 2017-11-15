package menuadding;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MenuAdding {

    List<Menu> menuArray = new LinkedList<>();
    
    public MenuAdding(){
        menuArray.add(new Menu("A0001", "Pikachu Meat", 5.90, "Best meat ever", 120, "Available"));
        menuArray.add(new Menu("A0002", "Vege Pizza", 10.90, "Best pizza ever", 343, "Available"));
        menuArray.add(new Menu("A0003", "Croissant bread", 2.45, "Best bread ever", 75, "Available"));
        System.out.println("Please select the following: ");
        System.out.println("1. Add new item to menu");
        System.out.print("Your choice: ");
    }
    
    public void displayMenu(){
        System.out.println("TO PROVE THAT THE ITEM IS ADDED\n===============================");
        for (Menu a : menuArray)
            System.out.printf("%s, %s, RM %.2f, %s, %d kcal, %s\n", a.foodCode, a.foodName, a.price, a.description, a.calories, a.status);
    }
    
    public boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public boolean isInt(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    
    public void addItem(){
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Please enter food name: ");
        String foodName = scanner2.nextLine();
        while(!foodName.matches("[A-Za-z ]+") || foodName.trim().isEmpty()){
            System.out.print("Alphabets only!\nPlease enter food name: ");
            foodName = scanner2.nextLine();
        }
        scanner2.reset();
        System.out.print("Please enter the price: RM ");
        String priceString = scanner2.nextLine();
        while(!isDouble(priceString) || priceString.trim().isEmpty() || Double.parseDouble(priceString) <= 0 ){
            System.out.print("Please enter a valid format!\nPlease enter the price: RM ");
            priceString = scanner2.nextLine();
        }
        double price = Double.parseDouble(priceString);
        scanner2.reset();
        System.out.print("Enter a description for the item: ");
        String description = scanner2.nextLine();
        while(description.trim().isEmpty()){
            System.out.print("Blank is not allowed!\nEnter a description for the item: ");
            description = scanner2.nextLine();
        }
        scanner2.reset();
        System.out.print("Please enter the calories(kcal): ");
        String caloriesString = scanner2.nextLine();
        while(!isInt(caloriesString) || caloriesString.trim().isEmpty() || Integer.parseInt(caloriesString) <= 0 ){
            System.out.print("Please enter a valid format!\nPlease enter the calories(kcal): ");
            caloriesString = scanner2.nextLine();
        }
        int calories = Integer.parseInt(caloriesString);
        menuArray.add(new Menu("A000"+(menuArray.size()+1), foodName, price, description, calories, "Available"));
        System.out.println("\nYou have successfully added an item to the menu!\n\n");
    }
    
    public static void main(String[] args) {
        MenuAdding test = new MenuAdding();
        Scanner scanner1 = new Scanner(System.in);
        scanner1.useDelimiter("");
        while(!scanner1.hasNext("1")){                         
            System.out.print("Your choice: ");
            scanner1.nextLine();
        }
        int choice = scanner1.nextInt();
        test.addItem();
        test.displayMenu();
    }
    
}
