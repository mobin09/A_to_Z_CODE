import java.util.ArrayList;
import java.util.List;
public class Arr0013 {
    public static void main(String[] args){
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length -1; i++){
            boolean isGreater = true;
            int current = arr[i];
            for(int j=i+1; j< arr.length; j++){
                if(current < arr[j]){
                    isGreater = false;
                    break;
                }
            }
            if(isGreater == true){
                list.add(current);
            }
        }
        list.add(arr[arr.length-1]);
        System.out.println(list);
    }
}