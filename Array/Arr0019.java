import java.util.Arrays;
public class Arr0019 {
    public static void main(String[] args){
        int[] arr = {-8, 1, 4, 6, 10, 45};
        int target = 16;
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length -1;
        while(l < r){
            if(arr[l] + arr[r] == target){
                System.out.println("Yes");
                return;
            }else if(arr[l] + arr[r] < target){
                l++;
            }else{
                // arr[l] + arr[r] > target
                r--;
            }
        }
        System.out.println("No");
        return;
    }
}
