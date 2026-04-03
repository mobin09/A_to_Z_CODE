public class RazorpayPayment implements PaymentGateway{
      public void initiatePayment(double amount) {
        System.out.println("Processing payment via Razorpay: ₹" + amount);
    }
}
