import java.sql.Time;
import java.util.Date;

public class Order {
    public String Name;
    public String OrderNum;
    public Date DateOfOrder;
    public Time TimeOfOrder;
    public String OrderItems;
    public Integer QuantityOfItems;
    public Double TotalPrice;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getOrderNum() {
        return OrderNum;
    }

    public void setOrderNum(String orderNum) {
        OrderNum = orderNum;
    }

    public Date getDateOfOrder() {
        return DateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        DateOfOrder = dateOfOrder;
    }

    public Time getTimeOfOrder() {
        return TimeOfOrder;
    }

    public void setTimeOfOrder(Time timeOfOrder) {
        TimeOfOrder = timeOfOrder;
    }

    public String getOrderItems() {
        return OrderItems;
    }

    public void setOrderItems(String orderItems) {
        OrderItems = orderItems;
    }

    public Integer getQuantityOfItems() {
        return QuantityOfItems;
    }

    public void setQuantityOfItems(Integer quantityOfItems) {
        QuantityOfItems = quantityOfItems;
    }

    public Double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        TotalPrice = totalPrice;
    }
}
