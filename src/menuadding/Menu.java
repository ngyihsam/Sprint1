package menuadding;


public class Menu {

    String foodCode;
    String foodName;
    double price;
    String description;
    int calories;
    
    public Menu() {}

    public Menu(String foodCode, String foodName, double price, String description, int calories) {
        this.foodCode = foodCode;
        this.foodName = foodName;
        this.price = price;
        this.description = description;
        this.calories = calories;
    }

    public String getFoodCode() {
        return foodCode;
    }

    public void setFoodCode(String foodCode) {
        this.foodCode = foodCode;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        //return foodCode + ", " + foodName + ", RM" + price + ", " + description + ", " + calories + "kcal";
        return String.format("%s, %s, RM %.2f, %s, %d kcal\n", foodCode, foodName, price, description, calories);
    }
    
    
}
