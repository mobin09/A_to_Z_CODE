public class Main {
     public static void main(String[] args) {
      TicketBookingService bookingService = new TicketBookingService();

        // All dependencies are created externally and passed in
        SeatValidator validator = new SeatValidator();
        PaymentProcessor payment = new PaymentProcessor();
        QRCodeGenerator qrGenerator = new QRCodeGenerator();
        EmailService emailService = new EmailService();

        bookingService.bookTicket("CONF-2025", "A12", "alice@example.com",
            99.99, validator, payment, qrGenerator, emailService);
            /*
            
            Checking seat A12 for event CONF-2025
            Charging $99.99 to alice@example.com
            Generated QR code: QR-CONF-2025-A12
            Sending confirmation to alice@example.com with code QR-CONF-2025-A12
            Booking confirmed!
            
            */
     }
}

