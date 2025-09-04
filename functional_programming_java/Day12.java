import java.util.HashSet;
import java.util.Set;

public class Day12 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        for(int n : set){
            System.out.println(n);
        }

    }
}
