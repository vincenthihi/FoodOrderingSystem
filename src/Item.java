public class Item {
    public String itemName;
    public Double itemPrice;
    public String itemDescription;
    public String itemIngredients;
    private int addItem;

    public int getAddItem() {
        return addItem;
    }

    public void setAddItem(int addItem) {
        this.addItem = addItem;
    }

    public int getRemoveItem() {
        return removeItem;
    }

    public void setRemoveItem(int removeItem) {
        this.removeItem = removeItem;
    }

    private int removeItem;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemIngredients() {
        return itemIngredients;
    }

    public void setItemIngredients(String itemIngredients) {
        this.itemIngredients = itemIngredients;
    }
}
