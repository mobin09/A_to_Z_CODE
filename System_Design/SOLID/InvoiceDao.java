package SOLID;

// Responsibility 1: Managing Database Operations only
 public class InvoiceDao {
  Invoice invoice;

  public InvoiceDao(Invoice invoice) {
    this.invoice = invoice;
  }

  public void saveToDB() {
   // Save into the DB the invoice
   System.out.println("Saving to DB...");
  }
}
