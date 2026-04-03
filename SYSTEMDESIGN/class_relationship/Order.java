import java.util.ArrayList;
import java.util.List;

class Order {
    private String orderId;
    private List<LineItem> lineItems;

    public Order(String orderId){
        this.orderId = orderId;
        this.lineItems = new ArrayList<>();
    }

    public void addItem(String productName, int quantity, double unitPrice){
        lineItems.add(new LineItem(productName, quantity, unitPrice));
    }

    public void removeItem(String productName){
        lineItems.removeIf(item -> item.getProductName().equals(productName));
    }

    public double getTotal(){
        double total = 0;
        for(LineItem items: lineItems){
            total += items.getSubTotal();
        }
        return total;
    }

    public void printReceipt(){
        System.out.println("OrderId::" + orderId);
        for(LineItem items: lineItems){
            items.describe();
        }
        System.out.printf("Total Price $%.2f%n", getTotal());
    }
}