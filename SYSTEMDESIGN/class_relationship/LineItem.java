public class LineItem {
    private String productName;
    private int quantity;
    private double unitPrice;

    public LineItem(String productName, int quantity, double unitPrice){
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double getSubTotal(){
        return quantity * unitPrice;
    }

    public String getProductName(){
        return productName;
    }

    public void describe(){
        String prodDetails = String.format("%s x %d @  $%.2f =  $%.2f",productName, quantity, unitPrice, getSubTotal());
        System.out.println(prodDetails);
    }
}
