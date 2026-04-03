class PaymentProcessor {
    public boolean charge(String email, double amount) {
        System.out.println("Charging $" + amount + " to " + email);
        return true; // Simulated: payment succeeds
    }
}