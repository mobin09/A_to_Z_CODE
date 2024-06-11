import java.util.HashMap;

public class Arr0031 {
    public static void main(String[] args) {
         // count pair with given sum
         int[] arr = {1,5,7,-1};
         int k = 6;
         int count = 0;
         HashMap<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(m.containsKey(k-arr[i])){
                count += m.get(k-arr[i]);
            }

            if(m.containsKey(arr[i])){
                m.put(arr[i], m.get(arr[i]) + 1);
            }else{
                m.put(arr[i], 1);
            }

        }
        System.out.println(count);
    }
}
