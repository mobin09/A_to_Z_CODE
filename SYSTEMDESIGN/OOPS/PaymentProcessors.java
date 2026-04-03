public interface PaymentProcessors {
    public void processPayment(double amount);
}

class CreditCardProcessor implements PaymentProcessors {
    public void processPayment(double amount){
        System.out.println("Processing credit card payment of " + amount);
    }
}
class PayPalProcessor implements PaymentProcessors {
     public void processPayment(double amount){
        System.out.println("Processijng paypal payment of " + amount);
     }
}

class UPIProcessor implements PaymentProcessors {
    public void processPayment(double amount){
        System.out.println("Processing UPI payment of " + amount);
    }
}


// Payment Service
class PaymentService {
    public void pay(PaymentProcessors payment, double amount){
        payment.processPayment(amount);
    }
}
