
import java.util.concurrent.*;
public class Day2 {
     public static void main(String[] args) {
        System.out.println("ConcurrentMap");
        ConcurrentMap cmap = new ConcurrentHashMap();
        cmap.putIfAbsent("Abc", "Abcd");

        System.out.println(cmap);


     } 
}
