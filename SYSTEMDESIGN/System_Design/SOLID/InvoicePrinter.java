package SOLID;

// Responsibility 1: Printing the Invoice only
 public class InvoicePrinter {
   private Invoice invoice;

   public InvoicePrinter(Invoice invoice) {
       this.invoice = invoice;
   }

   public void print() {
      // print the invoice
      System.out.println("Printing Invoice...");
    }
 }