import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Day8 {
    public static void main(String[] args){
       // CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
       List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> it = list.iterator();

        list.add("D");

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
