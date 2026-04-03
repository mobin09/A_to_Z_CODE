import java.util.Iterator;
import java.util.List;

public class Day001 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,4,7,8,9);
        Iterator<Integer>  it =  list.iterator();
        while(it.hasNext()){
            Integer x = it.next();
            System.out.println(x);
        }
    }
}