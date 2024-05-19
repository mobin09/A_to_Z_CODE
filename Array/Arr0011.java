// leetcode easy
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Arr0011 {
    public  static void main(String[] args){
        int[] arr = {2,5,1,3,4,7};
        int[] ans = new int[arr.length];
        int n=3;
        for(int i=0,j=0; i<n; i++){
            ans[j++] = arr[i];
            ans[j++] = arr[n+i];
        }

        System.out.println(Arrays.toString(ans));

        
    }
}
