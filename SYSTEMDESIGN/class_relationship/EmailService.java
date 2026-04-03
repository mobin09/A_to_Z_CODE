class EmailService {
    public void sendConfirmation(String email, String qrCode) {
        System.out.println("Sending confirmation to " + email + " with code " + qrCode);
    }
}
