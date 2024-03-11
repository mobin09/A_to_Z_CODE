
import java.util.ArrayList;
import java.util.Iterator;
public class Day1_02{
    public static void main(String[] args) {
         ArrayList al = new ArrayList();
         al.add("A");
         al.add("B");
         al.add("C");

         Iterator it = al.iterator();
         while(it.hasNext()){
            System.out.println(it.next());
           // al.add("M");
         }
    }
}