
public abstract class Menu {
    private String name;
    private double price;


    public Menu(String foodName, double foodPrice) {
        this.name= name;
        this.price = price;

    }

    public String getFoodName() {
        return name;
    }

    public void setFoodName(String foodName) {
        this.name = foodName;
    }

    public double getFoodPrice() {
        return price;
    }

    public void setFoodPrice(double foodPrice) {
        this.price = foodPrice;
    }
}

