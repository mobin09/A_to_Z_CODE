class QRCodeGenerator {
    public String generate(String eventId, String seatNumber) {
        String qrCode = "QR-" + eventId + "-" + seatNumber;
        System.out.println("Generated QR code: " + qrCode);
        return qrCode;
    }
}