public interface PaymentGatewayProcessor {
    public void processPayment(double amount);
}

class UPIPaymentGateway implements PaymentGatewayProcessor{
    public void processPayment(double amount){}
}

class OrderService {
   private PaymentGatewayProcessor paymentGatewayProcessor;

   public OrderService(PaymentGatewayProcessor paymentGatewayProcessor){
    this.paymentGatewayProcessor = paymentGatewayProcessor;
   }

   public void checkout(double amount){
       paymentGatewayProcessor.processPayment(amount);
   }

}