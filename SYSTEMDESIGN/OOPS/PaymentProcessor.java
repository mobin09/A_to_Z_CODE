public class PaymentProcessor {
    private String cardNumber;
    private double amount;

    public PaymentProcessor(String cardNumber, double amount){
        this.cardNumber = maskcardNumber(cardNumber);
        this.amount = amount;
    }

    private String maskcardNumber(String cardNumber){
        return "****-****-****"+cardNumber.substring(cardNumber.length()-4);
    }

    public void processPayment() {
        System.out.println("Processing payment of " + amount + " for card " + cardNumber);
    }

}
