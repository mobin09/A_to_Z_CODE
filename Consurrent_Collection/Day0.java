
import java.util.Arrays;
import java.util.stream.*;
public class Day0 {
    public static void main(String[] args) {
        int[] arr = {1,
            5,
            4,
            7,
            6,
            3,
            1};
       int x = Arrays.stream(arr).max().getAsInt(); 
       //System.out.println(x);

       int sum = Arrays.stream(arr).reduce(0, (a,b)-> a +b);
       System.out.println(sum);



    }
}
