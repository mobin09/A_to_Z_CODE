// Concrete implementation of Printable
public class PDFPrinter  implements Printable{
    @Override
    public void print(Document doc){
       System.out.println("Printing PDF:: "+doc.getContent());
    }
}
