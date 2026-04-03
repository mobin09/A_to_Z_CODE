public class StripePayment  implements PaymentGateway{
     public void initiatePayment(double amount) {
        System.out.println("Processing payment via Stripe: $" + amount);
    }
}
