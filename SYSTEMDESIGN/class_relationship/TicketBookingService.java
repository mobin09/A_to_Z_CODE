class TicketBookingService {
    public boolean bookTicket(String eventId, String seatNumber, String email,
                              double amount, SeatValidator validator,
                              PaymentProcessor payment, QRCodeGenerator qrGenerator,
                              EmailService emailService) {
        if (!validator.isAvailable(eventId, seatNumber)) {
            System.out.println("Seat not available.");
            return false;
        }

        if (!payment.charge(email, amount)) {
            System.out.println("Payment failed.");
            return false;
        }

        String qrCode = qrGenerator.generate(eventId, seatNumber);
        emailService.sendConfirmation(email, qrCode);

        System.out.println("Booking confirmed!");
        return true;
    }
}