import java.util.Arrays;

public class Arr0017 {
    public static void main(String[] args) {
        //hours = [0,1,2,3,4], target = 2
        int[] hours = {0,1,2,3,4};
        int target = 2;
         long l = Arrays.stream(hours).filter(x -> x >= target).count();
         System.out.println(l);
        }
}
