import java.util.HashSet;
import java.util.Set;

public class Arr0033 {
    public static void main(String[] args) {
        // Find the first repeating element in an array of integers
        int element = 0;
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        Set<Integer> set = new HashSet<>();
        for(int i= arr.length -1 ; i>0; i--){
            if(set.contains(arr[i])){
                element =  i;
                break;
            }else{
                set.add(arr[i]);
            }
        }
        //int index = 
        System.out.println(element);
    }
}
