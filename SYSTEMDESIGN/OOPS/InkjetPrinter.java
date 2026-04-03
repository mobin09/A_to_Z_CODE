public class InkjetPrinter implements Printable {
     @Override
     public void print(Document doc){
        System.out.println("Print by Inkjet printer:: " + doc.getContent());
     }
}
